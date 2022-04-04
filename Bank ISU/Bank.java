import java.util.ArrayList;
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
