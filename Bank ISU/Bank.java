import java.util.ArrayList;
public class Bank 
{
	private String name;
	private String address;
	private String phoneNumber;
	ArrayList<Accounts> accounts;
	//Default Constructor
	public Bank()
	{
		name = "TD Canada Trust";
		address = "3477 Sheppard Ave E, Scarborough, ON M1T 3K6";
		phoneNumber = "+1 (416)-291-9566";
		accounts = new ArrayList<Accounts>();
	}//end Bank() default
	public Bank(String name, String address, String phoneNumber, ArrayList<Accounts> accounts)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
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
	public String accountList()
	{
		String str = "";
		for(int i = 0; i < accounts.size(); i++)
		{
			str = str + accounts.get(i) + "\n";
		}//end for loop
		return str;
	}//end accountList()
	public String toString()
	{
		return "Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Phone Number: " + phoneNumber + "\n" + 
				"Accounts: " + accountList() + "\n";
	}//end toString()
}//end class
