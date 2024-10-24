import java.util.*;

class PrimeN
{
    public static void main(String arg[])
    {
        for(int i = 0;i < arg.length;i++)
        {
            int temp = Integer.parseInt(arg[i]);
            boolean flag = true;
            
            for(int j = 2;j <= temp/2;j++)
            {
                if(temp%j == 0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
            {
                System.out.println(arg[i]);
            }
        }
    }
}