import java.util.*;

abstract class order
{
    int id;
    String description;

    public void Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order id : ");
        this.id = sc.nextInt();
        System.out.println("Enter order description : ");
        sc.nextLine();
        this.description = sc.nextLine();
        
    }

    public void Display()
    {
        System.out.println("Order id : "+this.id);
        System.out.println("Order Description : "+this.description);
    }
}

class PurchaseOrder extends order
{
    String customerName;

    public void Accept()
    {
        super.Accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer Name : ");
        this.customerName = sc.next();
    }

    public void Display()
    {
        super.Display();
        System.out.println("Customer Name : "+this.customerName);   
    }
}

class SalesOrderr extends order
{
    String vendorName;

    public void Accept()
    {
        super.Accept();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vendor Name : ");
        this.vendorName = sc.next();
    }

    public void Display()
    {
        super.Display();
        System.out.println("Vendor Name : "+this.vendorName);
    }
}

class SalesOrder
{
    public static void main(String arg[])
    {
        PurchaseOrder p = new PurchaseOrder();
        p.Accept();
        p.Display();

        SalesOrderr s = new SalesOrderr();
        s.Accept();
        s.Display();
    }
}