package Mock_1;
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement 
//the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount {
	public double balance; //For checking the balance we need to declare the balance varible

	BankAccount(double Balance)// create a constructor 
	{
		this.balance = Balance;
	}

	abstract void deposit(double amount);

	abstract void withdraw(double amount);

	public void displayBalance()
	{// for displaying the balance: displayBalance
		System.out.println("Current Balance: " + balance);
	}
}

class SavingsAccount extends BankAccount
{// calculating the interest:
	private double intrestRate;

	SavingsAccount(double Balance, double intrestRate)
	{
		super(Balance);
		this.intrestRate = intrestRate;
	}

	public void deposit(double amount) {
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

	public void applyIntrest() {
		balance += balance * intrestRate / 100;
		System.out.println("Intrest applied. New balance: " + balance);
	}
}

class CurrentAccount extends BankAccount {
	private double Limit;

	CurrentAccount(double Balance, double Limit) {
		super(Balance);
		this.Limit = Limit;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	public void withdraw(double amount) {
		if (balance + Limit >= amount) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Insufficient funds for withdrawal.");
		}
	}
}

public class Mock_3_Demo{
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
		savingsAccount.displayBalance();
		savingsAccount.deposit(800);
		savingsAccount.withdraw(400);
		savingsAccount.applyIntrest();
		savingsAccount.displayBalance();
		CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
		currentAccount.displayBalance();
		currentAccount.deposit(300);
		currentAccount.withdraw(2500);
		currentAccount.displayBalance();
	}
}
