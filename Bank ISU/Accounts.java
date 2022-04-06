import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Accounts 
{
	private double balance;
	private String accountNumber;
	private String accountType;
	private String name;
	private String address;
	private String phoneNumber;
	private String password;
	ArrayList<String> transactions = new ArrayList<String>();
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
	public Accounts(double balance, String accNo, String accType, String name, String add, String phoneNum, String password)
	{
		this.balance = balance;
		accountNumber = accNo;
		accountType = accType;
		this.name = name;
		address = add;
		phoneNumber = phoneNum;
		this.password = password;
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
	public String getPassword()
	{
		return password;
	}//end getPassword()
	public ArrayList<String> getTransactions()
	{
		return transactions;
	}//end getTransactions()
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
	public void setPassword(String pass)
	{
		password = pass;
	}//end setPassword()
	public void changePassword()
	{
		String str, newPass;
		System.out.print("Please enter your current password. ");
		str = scanner.nextLine();
		if(str.equals(password))
		{
			System.out.print("Welcome " + getName() + ". What would you like to change your password to? ");
			newPass = scanner.nextLine();
			System.out.print("Please enter the new password once more to confirm. ");
			if(newPass.equals(scanner.nextLine()))
			{
				password = newPass;
				System.out.println("Your password has been updated.\n");
			}
		}
		else
		{
			System.out.println("The password you have entered is incorrect. Please restart and try again.\n");
		}
	}
	public String actionList()
	{
		String str = "";
		for(int i = 0; i < transactions.size(); i++)
		{
			str = str + transactions.get(i) + "\n";
		}//end for loop
		if(str.contentEquals(""))
		{
			return "There have been no transactions.\n";
		}
		return str;
	}//end actionList()
	public void deposit()
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
        String timeOfDay = date.format(new Date());
		double amount;
		System.out.print("How much would you like to deposit? ");
		amount = scanner.nextDouble();
		balance += amount;
		transactions.add(timeOfDay + " | " + accountNumber + " | NEW DEPOSIT: $" + amount + ". BALANCE [" + (balance - amount) + "] --> [" + balance + "]");
		System.out.println("You have successfully deposited $" + amount + " into your account. Your new balance is $" + balance + ".\n");
	}//end deposit()
	public void withdraw()
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
        String time = date.format(new Date());
		double amount;
		System.out.print("How much would you like to withdraw? ");
		amount = scanner.nextDouble();
		if(amount > balance)
		{
			System.out.println("The amount you have entered [$" + amount + "] is larger than your balance [$" + balance + "]. Please try again with an amount equal to or lower than your balance.\n");
			return;
		}
		balance -= amount;
		transactions.add(time + " | " + accountNumber + " | NEW WITHDRAWAL: $" + amount + ". BALANCE [" + (balance) + "] --> [" + (balance - amount) + "]");
		System.out.println("You have successfully withdrawn $" + amount + " from your account. Your new balance is $" + balance + ".\n");
		//System.out.println("100s: " + amount % 100 + "\n50s: " + (amount % 100) % 50 + "\n20s: " + ((amount % 100) % 50) % 20 + "\n10s: " + (((amount % 100) % 50) % 20) % 10 + "\n5s: " + ((((amount % 100) % 50) % 20) % 10) % 5);
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
