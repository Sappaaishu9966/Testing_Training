package practicePack;

	abstract class BankAccount 
	{
	   public  double balance;

	    public BankAccount(double initialBalance) 
	    {
	        this.balance = initialBalance;
	    }

	     abstract void deposit(double amount);

	     abstract void withdraw(double amount);

	    public void displayBalance() 
	    {
	        System.out.println("Current Balance: " + balance);
	    }
	}

	class SavingsAccount extends BankAccount
	{
	    private double interestRate;

	    public SavingsAccount(double initialBalance, double interestRate) 
	    {
	        super(initialBalance);
	        this.interestRate = interestRate;
	    }

	    public void deposit(double amount) 
	    {
	        balance += amount;
	        System.out.println("Deposit successful. New balance: " + balance);
	    }

	    public void withdraw(double amount) 
	    {
	        if (balance >= amount)
	        {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } 
	        else 
	        {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }

	    public void applyInterest()
	    {
	        balance += balance * interestRate / 100;
	        System.out.println("Interest applied. New balance: " + balance);
	    }
	}

	class CurrentAccount extends BankAccount 
	{
	    private double Limit;

	    public CurrentAccount(double initialBalance, double Limit) 
	    {
	        super(initialBalance);
	        this.Limit = Limit;
	    }

	    public void deposit(double amount) 
	    {
	        balance += amount;
	        System.out.println("Deposit successful. New balance: " + balance);
	    }

	    public void withdraw(double amount) 
	    {
	        if (balance + Limit >= amount) 
	        {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } 
	        else 
	        {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }
	}

	public class Mock_3_Demo
	{
	    public static void main(String[] args) 
	    {
	        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
	        savingsAccount.displayBalance();
	        savingsAccount.deposit(500);
	        savingsAccount.withdraw(200);
	        savingsAccount.applyInterest();
	        savingsAccount.displayBalance();

	        CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
	        currentAccount.displayBalance();
	        currentAccount.deposit(300);
	        currentAccount.withdraw(2500);
	        currentAccount.displayBalance();
	    }
	}	


