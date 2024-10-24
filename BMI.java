
class BMI
{
    public static void main(String arg[])
    {
        System.out.println("Full Name : "+arg[0]+" "+arg[1]+"\nWeight : "+arg[2]+"\nHeight : "+arg[3]+"\nBMI : "+(Float.parseFloat(arg[2])/(Float.parseFloat(arg[3])*Float.parseFloat(arg[3]))));
    }
}