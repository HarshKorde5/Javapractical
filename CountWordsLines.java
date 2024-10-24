import java.util.*;
import java.io.*;

class CountWordsLines
{
    public static void main(String arg[]) throws Exception
    {
        String filename = arg[0];

        File f = new File(filename);

        if(f.isFile())
        {
            FileInputStream file = new FileInputStream(filename);

            int ch,wordCount = 0,lineCount = 0;

            while((ch=file.read())!= -1)
            {
                if(ch==' ')
                {
                    wordCount++;
                }
                else if(ch == '\n')
                {
                    wordCount++;
                    lineCount++;
                }
            }

            System.out.println("Total number of words in the file are : "+wordCount+"\nTotal number of lines in the file are : "+lineCount);

            
        }
        else
        {
            System.out.println("File not found");
        }
    }
}