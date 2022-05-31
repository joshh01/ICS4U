/*
 * Bank class for BankClient
 * Holds information about banks
 */
import java.util.ArrayList;
public class Bank 
{
	private String name;
	private String address;
	private String phoneNumber;
	private String masterPin;
	ArrayList<Account> accounts;
	//Default Constructor
	public Bank()
	{
		name = "-";
		address = "-";
		phoneNumber = "-";
		accounts = new ArrayList<Account>();
	}//end Bank() default
	public Bank(String name, String address, String phoneNumber, String masterPin, ArrayList<Account> accounts)
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
		accounts = new ArrayList<Account>();
	}//end Bank()
	public void addAccount(Account newAcc)
	{
		accounts.add(newAcc);
	}//end addAccount
	public void removeAccount(Account remAcc)
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
	public ArrayList<Account> accountAL()
	{
		ArrayList<Account> AL = new ArrayList<Account>();
		for(int i = 0; i < accounts.size(); i++)
		{
			AL.add(accounts.get(i));
		}
		return AL;
	}
	public String bankInfo()
	{
		return "Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Number of Accounts: " + accountList().length() + "\n";
	}//end bankInfo()
	public String toString()
	{
		return "Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Accounts: \n\n" + accountList() + "\n";
	}//end toString()
}//end class
