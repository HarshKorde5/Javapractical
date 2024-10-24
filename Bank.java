
class Account
{
    int balance;

    public Account()
    {
        this.balance = 10000;
    }

    public void deposit(int amt)
    {
        this.balance += amt;
    }

    public void withdraw(int amt)
    {
        this.balance -= amt;
    }

    public void getBalance()
    {
        System.out.println("Balance : "+this.balance);
    }
}

class Bank
{
    public static void main(String arg[])
    {
        Account a = new Account();
        a.getBalance();
        a.deposit(1200);
        a.getBalance();
        a.withdraw(6000);
        a.getBalance();
    }
}