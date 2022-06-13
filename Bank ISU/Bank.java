import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bank 
{
	private String name;
	private String address;
	private String phoneNumber;
	private String masterPin;
	ArrayList<Accounts> accounts;
	//Default Constructor
	public Bank()
	{
		name = "TD Canada Trust";
		address = "3477 Sheppard Ave E, Scarborough, ON M1T 3K6";
		phoneNumber = "+1 (416)-291-9566";
		//masterPin = (int)Math.floor(Math.random() * 9000 + 1000) + "";
		masterPin = "0000";
		accounts = new ArrayList<Accounts>();
	}//end Bank() default
	public Bank(String name, String address, String phoneNumber, String masterPin,  ArrayList<Accounts> accounts)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.masterPin = masterPin;
		this.accounts = accounts;
	}//end Bank()
	public Bank(String name, String address, String phoneNumber, String masterPin)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.masterPin = masterPin;
		accounts = new ArrayList<Accounts>();
	}//end Bank()
	public void addAccount(Accounts newAcc)
	{
		accounts.add(newAcc);
	}//end addAccount
	public void removeAccount(Accounts remAcc)
	{
		accounts.remove(remAcc);
	}//end removeAccount
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
	public String getMasterPin()
	{
		return masterPin;
	}//end getMasterPin()
	public String accountList()
	{
		String str = "";
		for(int i = 0; i < accounts.size(); i++)
		{
			str = str + accounts.get(i) + "\n";
		}//end for loop
		if(str.equals(""))
		{
			str = "There are currently no accounts.";
		}
		return str;
	}//end accountList()
	public ArrayList<Accounts> accountAL()
	{
		ArrayList<Accounts> AL = new ArrayList<Accounts>();
		for(int i = 0; i < accounts.size(); i++)
		{
			AL.add(accounts.get(i));
		}
		return AL;
	}
	public boolean searchAccount(String accNum)
	{
		for(int i = 0; i < accountAL().size(); i++)
    	{
    		if(accountAL().get(i).getAccountNumber().contentEquals(accNum)) 
    		{
    			return true;
    		}//end if loop
    	}//end for loop
		return false;
	}//end searchAccount()
	public Accounts getAccount(String accNum)
	{
		int index = -1;
		for(int i = 0; i < accountAL().size(); i++)
    	{
    		if(accountAL().get(i).getAccountNumber().equals(accNum)) 
    		{
    			//System.out.println(bank.accountAL().get(i).getAccountNumber());
    			index = i;
    		}//end if loop
    	}//end for loop
		return accountAL().get(index);
	}//end getAccount()
	public void transferFunds(Accounts accSending)
	{
		double amount;
		String accountNumber = "";
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
        String time = date.format(new Date());
        Scanner scanner = new Scanner(System.in);
		System.out.print("What account [ID] would you like to send money to? ");
		accountNumber = scanner.nextLine();
		if(searchAccount(accountNumber))
		{
			Accounts accReceiving = getAccount(accountNumber);
			System.out.print("How much would you like to send to " + accReceiving.getName() + "? ");
			amount = Double.parseDouble(scanner.nextLine());
			if(amount > accSending.getBalance()) 
			{
				System.out.println("You do not have this much money in your account. Retry with a lower amount.\n");
			}//end inner if
			else
			{
				System.out.println();
				accSending.setBalance(accSending.getBalance() - amount);
				accReceiving.setBalance(accReceiving.getBalance() + amount);
				System.out.println("$" + amount + " has successfully been sent to: " + accReceiving.getName() + ".\n");
				accSending.addTransaction(time + " | " + accSending.getAccountNumber() + " | NEW TRANSFER: (-) $" + amount + ". BALANCE [" + (accSending.getBalance() + amount) + "] --> [" + (accSending.getBalance()) + "]");
				accReceiving.addTransaction(time + " | " + accountNumber + " | NEW TRANSFER: (+) $" + amount + ". BALANCE [" + (accReceiving.getBalance() - amount) + "] --> [" + (accReceiving.getBalance()) + "]");
			}//end else
		}//end outer if
		else
		{
			System.out.println("The account number you have entered [" + accountNumber + "] is invalid. Please restart and try again.\n");
		}//end else
		scanner.close();
	}//end transferFunds()
	public boolean validatePassword(String accNum, String password)
	{
		if(searchAccount(accNum) && (getAccount(accNum).getPassword().equals(password)))
		{
			return true;
		}//end if
		return false;
	}//end validatePassword()
	public String bankInfo()
	{
		return "Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Number of Accounts: " + accountAL().size() + "\n";
	}//end bankInfo()
	public String toString()
	{
		return "Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Accounts: \n\n" + accountList() + "\n";
	}//end toString()
}//end class
