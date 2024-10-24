import java.util.*;

interface Operation
{
    double PI = 3.142;

    public void volume();
}

class Cylinder implements Operation
{
    int radius;
    int height;
    public Cylinder(int r,int h)
    {
        this.radius = r;
        this.height = h;
    }

    public void volume()
    {
        System.out.println("Volume : "+(PI*radius*radius*height));
    }
}

class CylinderVolume
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int r = sc.nextInt();
        System.out.println("Enter height : ");
        int h = sc.nextInt();

        Cylinder c = new Cylinder(r,h);
        c.volume();
    }
}