import java.util.Scanner;
public class BankClient 
{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		int choice;
		boolean found = false;
		Bank bank = new Bank();
		Accounts account = new Accounts(83829, "0000-0000-0000-0001", "Savings", "Joshua de Souza", "76 Islington Avenue", "647-995-0172");
		Accounts acc2 = new Accounts(2000, "0000-0000-0000-0002", "Chequing", "Marino Marchesan", "123 Queens St", "649-965-0521");
		//Scanner scanner = new Scanner(System.in);
		bank.addAccount(account);
		do
		{
			welcome(bank);
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice)
            {
            case 1:
            	System.out.println("Choice: [1] Create a bank account.");
                Accounts acc = createAccount();
                bank.addAccount(acc);
                System.out.println("An account has been opened under " + acc.getName() + ". Use [6] to review your information.\n");
                break;
            case 2:
            	System.out.println("Choice: [2] View bank information.");
            	System.out.println(bank.bankInfo());
            	break;
            case 3:
            	/*
            	System.out.println("Choice: [3] Make a deposit");
            	System.out.println("What account [id] would you like to deposit into?");
            	String accNum = scanner.nextLine();
            	for(int i = 0; i < bank.accountList().length() - 1; i++)
            	{
            		found = bank.accountAL().get(0).searchAccount(accNum);
            		if(found)
            		{
            			bank.accountAL().get(0).deposit();
            		}
            	}
            	System.out.println(account);
            	//search here
            	break;*/
            case 4:
            	System.out.println("Choice: [4] Withdraw money");
            	//search here
            	break;
            case 5:
            	System.out.println("Choice: [5] View all accounts");
            	System.out.println(bank.accountList() + "\n");
            	break;
            case 6:
            	System.out.println("Choice: [6] Search for an account");
            	//search here
            	break;
            case 7:
            	System.out.println("Choice: [7] Edit account information");
            	//search here
            	break;
            case 8:
            	System.out.println("Choice: [8] Transfer funds");
            	//search here, take 2 accs
            	break;
            case 9:
            	System.out.println("Thank you for using " + bank.getName() + " today!");
            	break;
            default:
            	System.out.println("You have entered an invalid choice. Please try again.\n");
            }
        }
        while (choice != 9);
	}//end main()
	public static Accounts createAccount()
	{
		Accounts acc = new Accounts();
		String accNo = "";
		//Scanner scanner = new Scanner(System.in);
		System.out.print("What name would you like to be put on the account? ");
		acc.setName(scanner.nextLine());
		accNo = ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000));
		acc.setAccountNumber(accNo);
		System.out.print("What type of account would you like to open? [Checking, Savings, MMA, CD] ");
		acc.setAccountType(scanner.nextLine());
		System.out.print("For security purposes, what is your address? ");
		acc.setAddress(scanner.nextLine());
		System.out.print("For contact purposes, what is your phone number? ");
		acc.setPhoneNumber(scanner.nextLine());	
		System.out.println();
		return acc;
	}//end createAccount()
	public static void welcome(Bank bank)
	{
		System.out.println("Welcome to " + bank.getName() + "!");
		System.out.println("Please choose from one of our options to get started!");
		System.out.println("[1] Create a bank account ");
		System.out.println("[2] View bank information");
		System.out.println("[3] Make a deposit");
		System.out.println("[4] Withdraw money");
		System.out.println("[5] View all accounts");
		System.out.println("[6] Search for an account");
		System.out.println("[7] Edit account information");
		System.out.println("[8] Transfer funds");
		System.out.println("[9] Exit");
		System.out.println();
	}//end welcome()
}//end class
