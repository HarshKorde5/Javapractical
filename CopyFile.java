import java.util.*;
import java.io.*;

class CopyFile
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first file name : ");
        String file1 = sc.next();

        System.out.println("Enter second file name : ");
        String file2 = sc.next();

        File f1 = new File(file1);
        File f2 = new File(file2);

        if(f1.isFile()&&f2.isFile())
        {
            FileInputStream filein = new FileInputStream(file1);
            FileOutputStream fileout = new FileOutputStream(file2);
            int ch;
            while((ch = filein.read())!= -1)
            {
                fileout.write(ch);
            }
            System.out.println("Contents copied");

            filein.close();
            fileout.close();
        }
        else
        {
            System.out.println("File not found");
        }
    }
}