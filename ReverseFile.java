import java.util.*;
import java.io.*;

class ReverseFile
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String fileName = sc.next();

        File f = new File(fileName);

        if(f.isFile())
        {
            BufferedInputStream bobj = new BufferedInputStream(new FileInputStream(fileName));

            int size = bobj.available();

            for(int i = size -1;i >= 0;i--)
            {
                bobj.mark(i);
                bobj.skip(i);

                char ch = ((char)bobj.read());

                if(Character.isLowerCase(ch))
                {
                    ch = Character.toUpperCase(ch);
                }
                else if(Character.isUpperCase(ch))
                {
                    ch = Character.toLowerCase(ch);
                }

                System.out.print(ch);
                bobj.reset();
            }
            bobj.close();
        }   
        else
        {
            System.out.println("File not found");
        }
    }
}