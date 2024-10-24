import java.util.*;

interface FindCube
{
    public void displayCube(int n);
}

class Cube implements FindCube
{
    public void displayCube(int n)
    {
        System.out.println(n*n*n);
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Cube c = new Cube();
        c.displayCube(n);

    }
}