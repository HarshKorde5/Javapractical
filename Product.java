import java.util.*;

interface MarkerInt
{

}

class Product implements MarkerInt
{
    String pname;
    int pid,pcost,quantity;
    static int cnt = 0;

    public Product()
    {
        pid = 1;
        pname = "pen";
        pcost = 10;
        quantity = 1;
        cnt++;
    }

    public Product(int id,String n,int c,int q)
    {
        pid = id;
        pname = n;
        pcost = c;
        quantity = q;
        cnt++;
        System.out.println("Count of objects : "+cnt);
    }

    public void Display()
    {
        System.out.println("Product id : "+pid+"\nProduct name : "+pname+"\nProduct cost : "+pcost+"\nProduct quantity : "+quantity);
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products : ");
        int n = sc.nextInt();
        Product p[] = new Product[n];

        System.out.println("Enter product details : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println("Enter product id : ");
            int id = sc.nextInt();

            System.out.println("Enter product name : ");
            String productName = sc.next();

            System.out.println("Enter product cost : ");
            int cost = sc.nextInt();

            System.out.println("Enter product quantity : ");
            int quantity = sc.nextInt();

            p[i] = new Product(id,productName,cost,quantity);
        }

        for(int i = 0;i < n;i++)
        {
            p[i].Display();
        }
    }
}