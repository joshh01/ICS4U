import java.util.Scanner;
public class Accounts 
{
	private double balance;
	private String accountNumber;
	private String accountType;
	private String name;
	private String address;
	private String phoneNumber;
	Scanner scanner = new Scanner(System.in);
	//Default Constructor
	public Accounts()
	{
		accountNumber = "0000-0000-0000-0000";
		accountType = "Savings";
		name = "-";
		address = "-";
		phoneNumber = "-";
		balance = 0.0;
	}//end Accounts() default
	public Accounts(double balance, String accNo, String accType, String name, String add, String phoneNum)
	{
		this.balance = balance;
		accountNumber = accNo;
		accountType = accType;
		this.name = name;
		address = add;
		phoneNumber = phoneNum;
	}//end Accounts()
	//Get Methods
	public double getBalance()
	{
		return balance;
	}//end getBalance()
	public String getAccountNumber()
	{
		return accountNumber;
	}//end getAccountNumber()
	public String getAccountType()
	{
		return accountType;
	}//end getAccountType()
	public String getName()
	{
		return name;
	}//end getName()
	public String getAddress()
	{
		return address;
	}//end getAddress()
	public String getPhoneNumber()
	{
		return phoneNumber;
	}//end getPhoneNumber()
	//Set Methods
	public void setBalance(double bal)
	{
		balance = bal;
	}//end setBalance()
	public void setAccountNumber(String accNo)
	{
		accountNumber = accNo;
	}//end setAccountNumber()
	public void setAccountType(String accType)
	{
		accountType = accType;
	}//end setAccountType()
	public void setName(String nam)
	{
		name = nam;
	}//end setName()
	public void setAddress(String addr)
	{
		address = addr;
	}//end setAddress
	public void setPhoneNumber(String num)
	{
		phoneNumber = num;
	}//end setPhoneNumber()
	public void deposit()
	{
		double amount;
		System.out.print("How much would you like to deposit? ");
		amount = scanner.nextDouble();
		balance += amount;
		System.out.println("You have successfully deposited $" + amount + " into your account. Your new balance is $" + balance + ".\n");
	}//end deposit()
	public void withdraw()
	{
		double amount;
		System.out.println("How much would you like to withdraw?");
		amount = scanner.nextDouble();
		balance -= amount;
		System.out.println("You have successfully withdrawn $" + amount + " from your account. Youe new balance is $" + balance + ".\n");
	}//end withdraw()
	public String toString()
	{
		return "Name on Account: " + name + "\n" + 
				"Account Number: " + accountNumber + "\n" +
				"Account Type: " + accountType + "\n" + 
				"Address: " + address + "\n" +
				"Phone Number: " + phoneNumber + "\n" +
				"Balance: $" + balance + "\n";
	}
}//end class
