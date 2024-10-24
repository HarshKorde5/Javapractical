import java.util.*;

class Employee
{
    int Empid,Empsal;
    String Empname,Empdesignation;

    public Employee(int id,String name,String des,int sal)
    {
        this.Empid = id;
        this.Empsal = sal;
        this.Empname = name;
        this.Empdesignation = des;
    }

    public void display()
    {
        System.out.println("Employee ID : "+this.Empid+"\nEmployee Name : "+this.Empname+"\nDesignation : "+this.Empdesignation+"\nSalary : "+this.Empsal);
    }
}

class DisplayEmployee
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id : ");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name : ");
        String name = sc.next();

        System.out.println("Enter Employee Designation : ");
        String des = sc.next();

        System.out.println("Enter Employee Salary : ");
        int sal = sc.nextInt();

        Employee e = new Employee(id,name,des,sal);
        e.display();
    }
}