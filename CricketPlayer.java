import java.util.*;

class Player
{
    public String name;
    public int no_of_innings;
    public int no_of_times_notout;
    public int total_runs;
    public double bat_avg;

    public Player(String name,int no1,int no2,int no3)
    {
        this.name = name;
        this.no_of_innings = no1;
        this.no_of_times_notout = no2;
        this.total_runs = no3;
    }

    public static void calculateAvg(Player p[])
    {
        for(int i = 0;i < p.length;i++)
        {
            p[i].bat_avg = p[i].total_runs/p[i].no_of_innings;
        }


    }   

    public static void sortAvg(Player p[])
    {
        for(int i = 0;i < p.length;i++)
        {
            for(int j = 0;j < p.length-i-1;j++)
            {
                if(p[j].bat_avg > p[j+1].bat_avg)
                {
                    Player temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
    }

}

class CricketPlayer
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter total players : ");
        int n = sobj.nextInt();

        Player p[] = new Player[n];
        System.out.println("Enter player information : ");

        for(int i = 0;i < n;i++)
        {
            System.out.println("Enter player name : ");
            String name = sobj.next();

            System.out.println("Enter total number of innings played : ");
            int no1 = sobj.nextInt();

            System.out.println("Enter total number of not out : ");
            int no2 = sobj.nextInt();

            System.out.println("Enter total runs scored : ");
            int no3 = sobj.nextInt();

            p[i] = new Player(name,no1,no2,no3);
        }

        Player.calculateAvg(p);
        Player.sortAvg(p);

        for(int i = 0;i < p.length;i++)
        {
            System.out.println(p[i].name+" :: "+p[i].bat_avg);
        }
    }
}