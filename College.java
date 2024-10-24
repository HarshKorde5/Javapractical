import java.util.*;

class college
{
    int cno;
    String cname,caddr;

    public college(int n,String name,String addr)
    {
        this.cno = n;
        this.cname = name;
        this.caddr = addr;
    }
}

class department extends college
{
    public int dno;
    public String dname;

    public department(int n,String cn,String addr,int dn,String name)
    {
        super(n,cn,addr);
        this.dno = dn;
        this.dname = name;
    }

    public void display()
    {
        System.out.println("College name : "+cname+"\nCollege number : "+cno+"\nCollege Address : "+caddr+"\nDepartment name : "+dno+"\nDepartment name : "+dname);
    }
}

class College
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter college details : ");
        
        System.out.println("Enter college name : ");
        String cname = sc.next();
        
        System.out.println("Enter college number : ");
        int cno = sc.nextInt();

        System.out.println("Enter college address : ");
        String caddr = sc.next();

        System.out.println("Enter department name : ");
        String dname = sc.next();

        System.out.println("Enter department number : ");
        int dno = sc.nextInt();

        department d = new department(cno,cname,caddr,dno,dname);
        d.display();

    }
}
