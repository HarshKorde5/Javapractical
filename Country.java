class Continent
{
    public Continent()
    {
        System.out.println("Asia");
    }
}

class Countryy extends Continent
{
    public Countryy()
    {
        System.out.println("India");
    }
}

class State extends Countryy
{   
    public State()
    {
        System.out.println("Maharashtra");
    }
}

class Country
{
    public static void main(String arg[])
    {
        State s = new State();
        System.out.println("Pune");
    }
}