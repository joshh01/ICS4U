import java.util.ArrayList;
public class BankClient 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Accounts account = new Accounts(83829, "0000-0000-0000-0001", "Savings", "Joshua de Souza", "76 Islington Avenue", "647-995-0172");
		Bank bank = new Bank();
		System.out.println(bank);
		System.out.println(account);
	}//end main()
}//end class
