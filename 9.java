//====================================================================================
//NAME            : BHAVANA BAFNA
//CLASS           : SE 09
//BATCH           : E 09
//ROLL NO.        : 23107
//ASSIGNMENT NO.  : 9
//ASSIGNMENT NAME : CASE STUDY
//====================================================================================

package Bank;
import java.util.Scanner;
class BankMain 
{
    static Scanner sd=new Scanner(System.in);
    public SavingsAccount a=new SavingsAccount();
    public Customer c=new Customer();
    public SavingsAccount createAccount()
    {  
        System.out.print("Enter your name: ");
        String customername=sd.nextLine();
        System.out.print("Enter your age: ");
        int customerage=sd.nextInt();
        if(customerage<18)
        {      
            do
            {
                System.out.print("Minimum age should be 18 to create an account.\nPlease enter valid age: ");
                customerage=sd.nextInt();
            }while(customerage<18);
        }    
        System.out.print("Enter your account Id: ");
        int accountid=sd.nextInt();
        System.out.print("Enter your account type: ");
        String accounttype=sd.next();
        System.out.print("Enter balance: ");
        double balance=sd.nextDouble();
        System.out.print("Enter minimum balance: ");
        double minbalance=sd.nextDouble();
        c.setCustomerName(customername);
        c.setCustomerAge(customerage);
        a.setAccountId(accountid);
        a.setAccountType(accounttype);
        a.setBalance(balance);
        a.setMinimumBalance(minbalance);
        a.setCustomerObject(c);
        return a;
}
abstract class Account 
{
    protected double balance;
    protected int accountId;
    protected String accountType;
    protected Customer custobj; 
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
//    	System.out.println("Balance");
        return balance;
    }
    public void setAccountId(int accountId)
    {
        this.accountId=accountId;
    }
    public int getAccountId()
    {
        return accountId;
    }
    public void setAccountType(String accountType)
    {
        this.accountType=accountType;
    }    
    public String getAccountType()
    {
        return accountType;
    }   
    public void setCustomerObject(Customer custobj)
    {
        this.custobj=custobj;
    }
    public Customer getCustomerObject()
    {
        return custobj;
    }
    public abstract boolean withdraw(double amount);
}
class Customer 
{
    private String customerName;
    private int customerAge;
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerAge(int customerAge)
    {
        this.customerAge=customerAge;
    }
    public int getCustomerAge()
    {
        return customerAge;
    }
}
public class SavingsAccount extends Account
{
	Customer c;
	Account a;
	SavingsAccount s;
    private double minimumBalance; 
    public void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance=minimumBalance;
    } 
    public double getMinimumBalance()
    {
        return minimumBalance;
    } 
    public boolean withdraw(double amount)
    {
    	//System.out.println("Withdraw");
    	double x=a.getBalance();
    	double y=x-amount;
        if((y)>minimumBalance)
        {
        	//System.out.println("Withdraw1");
            return true;
        }
        else
        {
        	//System.out.println("Withdraw2");
            return false;
        }
    }
}
	public void displayAccountInformation() 
	{
		// TODO Auto-generated method stub
		System.out.println("Customer Name: "+c.getCustomerName());
		System.out.println("Customer Age: "+c.getCustomerAge());
		System.out.println("Customer Account Type: "+a.getAccountType());
		System.out.println("Customer Account ID: "+a.getAccountId());
		System.out.println("Customer Balance: "+a.getBalance());
	}
	public void checkBalance() 
	{
		// TODO Auto-generated method stub
		double b = 0;
		b=b+a.getBalance();
		System.out.print("Customer Bank Balance: "+b);
	}
	public void depositAmount(double amount) 
	{
		// TODO Auto-generated method stub
    	a.setBalance(a.getBalance()+amount);
	}
	public void getWithdrawAmount() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		double amount=sd.nextInt();
		if(a.withdraw(amount)==true)
		{
			System.out.println("Yess");
			double y=a.getBalance()-amount;
			System.out.println("The Updated amount in your bank is: "+y);
		}
		else
		{
			System.out.println("You dont have sufficient bank balance");
		}
	}
}
public class assignment_9 
{
	public static void main(String[] args)
	{ 
		BankMain.SavingsAccount a;
        Scanner sd=new Scanner(System.in);
        BankMain bm=new BankMain();
        String ans;
        do
        {
           System.out.println("\n1.Create Account\n2.Display Account\n3.Check Balance\n4.Deposit Amount\n5.Withdraw Amount");
           System.out.print("Enter your choice: ");
           int choice=sd.nextInt();
           System.out.println("");
           switch(choice)
           {
                case 1:
                	   a=bm.createAccount();
                       break;             
                case 2:
                	   bm.displayAccountInformation();
                       break;                
                case 3:
                	   bm.checkBalance();
                       break;                         
                case 4:
                	   System.out.print("Enter the amount you want to deposit: ");
                       double amount=sd.nextDouble();
                       bm.depositAmount(amount);
                       break;                     
                case 5:
                	   bm.getWithdrawAmount();
                       break;                 
                default:
                	break;              
           }
        System.out.print("\nDo you want to perform more actions? (Y/N): ");  
        ans=sd.next();
        }while(ans.equalsIgnoreCase("y"));
    }
}

//-----------------------------OUTPUT-----------------------------
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 1
//
//Enter your name: Bhavana
//Enter your age: 19
//Enter your account Id: 12345
//Enter your account type: Savings
//Enter balance: 20000
//Enter minimum balance: 1000
//
//Do you want to perform more actions? (Y/N): Y
//
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 2
//
//Customer Name: Bhavana
//Customer Age: 19
//Customer Account Type: Savings
//Customer Account ID: 12345
//Customer Balance: 20000.0
//
//Do you want to perform more actions? (Y/N): Y
//
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 3
//
//Customer Bank Balance: 20000.0
//Do you want to perform more actions? (Y/N): Y
//
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 4
//
//Enter the amount you want to deposit: 2000
//
//Do you want to perform more actions? (Y/N): Y
//
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 3
//
//Customer Bank Balance: 22000.0
//Do you want to perform more actions? (Y/N): Y
//
//1.Create Account
//2.Display Account
//3.Check Balance
//4.Deposit Amount
//5.Withdraw Amount
//Enter your choice: 5
//
//Enter the amount to be withdrawed
//1000
//
//Customer Bank Balance: 21000.0
//Do you want to perform more actions? (Y/N): N
//