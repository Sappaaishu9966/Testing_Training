package java_oops_practice;

class Venkat {
	   private String accountNumber;
	    private double balance;

	    public Venkat(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {  // 1.constructor
	        balance -= amount;
	    }
	  }

	  class SavingsAccount extends Venkat {
	      private double interestRate;

	      double balance=0;
	      public SavingsAccount(String accountNumber, double balance, double interestRate) {
	          super(accountNumber, balance);  //2immeditey  go two the parents class
	          this.interestRate = interestRate;//values in assign cheysandi ki set..values ni declare cheysandie get use cheysathamuu ..
	          
	      }

	      public double getInterestRate() {
	          return interestRate;
	      }

	      public void deposit(double amount) {
	          balance += amount;
	          balance += (amount * interestRate);
	      }

	      public void withdraw(double amount) {
	          balance -= amount;
	      }
	  }

	  public class Demo {
		  public static void main(String[] args) {
		        SavingsAccount account1 = new SavingsAccount("123456", 5000, 0.05);
		        System.out.println("Account number: " + account1.getAccountNumber());
		        System.out.println("Balance: " + account1.getBalance());
		        System.out.println("Interest rate: " + account1.getInterestRate());

		        account1.deposit(1000);
//		        System.out.println("Updated balance: " + account1.getBalance());
//
//		        account1.withdraw(500.0);
//		       
		  }
	  }
	                    	          
		             
	
	
 
	
	


