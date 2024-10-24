import java.util.*;

class Clock
{
    int hours,minutes,seconds;

    public Clock()
    {
        System.out.println("Enter the time in HH MM SS format : ");
        Scanner sc = new Scanner(System.in);
        this.hours = sc.nextInt();
        this.minutes = sc.nextInt();
        this.seconds = sc.nextInt();
    }

    void isTimeValid()
    {
        if(hours >= 0 && hours < 24 && minutes > 0 && minutes < 60 && seconds > 0 && seconds < 60)
        {
            System.out.println("Time is valid");
        }
        else
        {
            System.out.println("Time is not valid");
        }
    }

    void setTimeMode()
    {
        if(hours < 12)
        {
            System.out.println("Time :: "+hours+":"+minutes+":"+seconds+"AM");
        }
        else
        {
            hours = hours - 12;
            System.out.println("Time :: "+hours+":"+minutes+":"+seconds+"PM");
        }
    }

    public static void main(String arg[])
    {
        Clock c = new Clock();
        c.isTimeValid();
        c.setTimeMode();

    }
}