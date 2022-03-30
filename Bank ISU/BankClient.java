import java.util.ArrayList;
import java.util.Scanner;
public class BankClient 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		Bank bank = new Bank();
		Accounts account = new Accounts(83829, "0000-0000-0000-0001", "Savings", "Joshua de Souza", "76 Islington Avenue", "647-995-0172");
		Accounts acc2 = new Accounts(2000, "0000-0000-0000-0002", "Chequing", "Marino Marchesan", "123 Queens St", "649-965-0521");
		//System.out.println(bank);
		//System.out.println(account);
		bank.addAccount(account);
		bank.addAccount(acc2);
		System.out.println(bank);
		//call #1 john acc OBJECT#!
		//call #2 mary acc OBJECT#2
	}//end main()
	public static void createAccount()
	{
		double balance;
		String accNo = "", name, accountNumber, accountType, address, phoneNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.print("What name would you like to be put on the account?");
		name = scanner.nextLine();
		Accounts acc = new Accounts();
		accNo = ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000));
		accountNumber = accNo;
		System.out.print("What type of account would you like to open? [Checking, Savings, MMA, CD]");
		accountType = scanner.nextLine();
		System.out.print("For security purposes, what is your address?");
		address = scanner.nextLine();
		System.out.print("For contact purposes, what is your phone number?");
		phoneNumber = scanner.nextLine();
		balance = 0;
		
		scanner.close();
	}//end createAccount()
}//end class
