import java.util.*;

class InvalidPassword extends Exception
{
    public InvalidPassword()
    {
        super("Invalid Password");
    }
}

class UserPass
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();

        try
        {
            if(username.equals(password))
            {
                System.out.println("Username and password matched");
            }
            else
            {
                throw new InvalidPassword();
            }
        }
        catch(InvalidPassword e)
        {
            System.out.println(e);
        }

    }
}