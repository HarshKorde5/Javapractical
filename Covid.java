import java.util.*;

class CovidException extends Exception
{
    CovidException()
    {
        super("Patient is Covid Positive and need to Hospitalized");
    }
}

class Patient
{
    public String patient_name;
    public int patient_age,patient_oxy_level,patient_HRCT_report;

    public Patient(String name,int age,int oxy,int HRCT)
    {
        this.patient_name = name;
        this.patient_age = age;
        this.patient_oxy_level = oxy;
        this.patient_HRCT_report = HRCT;
    }


}

class Covid
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter patient name : ");
        String name = sobj.next();

        System.out.println("Enter patient age : ");
        int age = sobj.nextInt();

        System.out.println("Enter patient oxygen level : ");
        int oxy = sobj.nextInt();

        System.out.println("Enter patient HRCT report : ");
        int HRCT = sobj.nextInt();

        Patient p = new Patient(name,age,oxy,HRCT);

        try
        {
            if(p.patient_oxy_level < 95 && p.patient_HRCT_report > 10)
            {
                throw new CovidException();
            }
            else
            {
                System.out.println("Patient name : "+name+"\nPatient age : "+age+"\nPatient oxygen level : "+oxy+"\nPatient HRCT scan report : "+HRCT);
            }
        }
        catch(CovidException e)
        {

        }
    }
}