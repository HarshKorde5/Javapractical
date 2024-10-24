import java.util.*;

abstract class Staff
{
    public String E_Name;
    public Staff(String str)
    {
        this.E_Name = str;
    }
}

class OfficeStaff extends Staff
{
    public String department;

    public OfficeStaff(String E_Name,String dep)
    {
        super(E_Name);
        this.department = dep;
    }

}

class AbstractStaff
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sobj.nextInt();

        OfficeStaff s[] = new OfficeStaff[n];

        System.out.println("Enter staff details : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println("Enter employee name : ");
            String name = sobj.next();

            System.out.println("Enter department name : ");
            String dep = sobj.next();

            s[i] = new OfficeStaff(name,dep);
        }


        System.out.println("Staff details are as follows : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println("Employee name : "+s[i].E_Name);

            System.out.println("Department name : "+s[i].department);
        }

    }
}