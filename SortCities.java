import java.util.*;


class SortCities
{
    public static void sortCity(String cities[])
    {
        Arrays.sort(cities);
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total number of cities : ");
        int n = sobj.nextInt();

        String cities[] = new String[n];
        System.out.println("Enter the names of cities : ");
        for(int i = 0;i < n;i++)
        {
            cities[i] = sobj.next();
        }

        
        Arrays.sort(cities);

        System.out.println("Cities after sorting in ascending order : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println(cities[i]);
        }
    }
}