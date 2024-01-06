import java.util.*;
class UserAccount{
    int balance=0;
    public UserAccount(int amountdata){
        this.balance=amountdata;
    }
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Available Balance: "+balance);
    }
    public void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Unable to withdraw.. withdraw amount is more than Available balance");
        }
        else
        {
            balance-=amount;
            System.out.println("Available Balance: "+balance);
        }
    }
    public void checkbalance()
    {
        System.out.println("Available Balance: "+balance);
    }
}
class ATM{
    private UserAccount account;
    
    public ATM(UserAccount account)
    {
        this.account=account;
    }
    public void checkBalance()
    {
        account.checkbalance();
    }
    public void Deposit(int value)
    {
        account.deposit(value);
    }
    public void WithDraw(int value)
    {
        account.withdraw(value);
    }
}
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter the intial balance of the user");
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    UserAccount one=new UserAccount(n);
		ATM a=new ATM(one);
		while(true)
        {
            System.out.println("welcome to ATM machine");
            System.out.println("1.withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.check balance");
            System.out.println("4.exit\n");
            
            int num=s.nextInt();
            switch(num)
            {
                case 1:
                    System.out.println("enter amount to be withdraw");
                    int w=s.nextInt();
                    a.WithDraw(w);
                    break;
                case 2:
                    System.out.println("enter the amount to deposit");
                    int d=s.nextInt();
                    a.Deposit(d);
                    break;
                case 3:
                    a.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
                    
                    
            }
        }
	}
}