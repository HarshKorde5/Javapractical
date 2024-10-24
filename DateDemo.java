import java.text.SimpleDateFormat;
import java.util.Date;

class DateDemo
{
    public static void main(String arg[])
    {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        String strDate1 = formatter1.format(date);
        System.out.println("Current date is : "+strDate1);

        SimpleDateFormat formatter2 = new SimpleDateFormat("MM-dd-yyyy");
        String strDate2 = formatter2.format(date);
        System.out.println("Current date is : "+strDate2);

        SimpleDateFormat formatter3 = new SimpleDateFormat("EEEEE MMMMM dd yyyy");
        String strDate3 = formatter3.format(date);
        System.out.println("Current date is : "+strDate3);

        SimpleDateFormat formatter4 = new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy");
        String strDate4 = formatter4.format(date);
        System.out.println("Current date and time is : "+strDate4);

        SimpleDateFormat formatter5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        String strDate5 = formatter5.format(date);
        System.out.println("Current date and time is : "+strDate5);

    }
}