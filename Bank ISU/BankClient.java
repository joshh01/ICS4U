import java.util.Scanner;
import java.util.ArrayList;
public class BankClient 
{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		int choice;
		String name, accountNumber, accountType, address, phoneNumber, str;
		ArrayList<Bank> banks = new ArrayList<Bank>();
		Bank td = new Bank();
		Bank rbc = new Bank("RBC", "76 Islington Avenue", "416-783-6283", "0864");
		Bank scotiabank = new Bank("Scotiabank", "183 Burlington Drive", "647-002-8362", "9540");
		banks.add(td);
		banks.add(rbc);
		banks.add(scotiabank);
		Accounts account = new Accounts(83829, "0000-0000-0000-0001", "Savings", "Joshua de Souza", "76 Islington Avenue", "647-995-0172", "marino");
		Accounts acc2 = new Accounts(2000, "0000-0000-0000-0002", "Chequing", "Marino Marchesan", "123 Queens St", "647-965-0521", "xd");
		//bank.addAccount(account);
		//bank.addAccount(acc2);
		System.out.println("Welcome to the Federal Banking System. Please choose from one of our banks to begin.");
		printBanks(banks);
		name = scanner.nextLine();
		while(!validateBank(banks, name))
		{
			System.out.println("The bank you have entered [" + name + "] is invalid. Please try again.");
			name = scanner.nextLine();
		}
		//System.out.println(getBank(banks, name));
		Bank bank = getBank(banks, name);
		do
		{
			welcome(bank);
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice)
            {
            case 1:
            	System.out.println();
            	System.out.println("Choice: [1] Create a bank account.");
                Accounts acc = createAccount();
                bank.addAccount(acc);
                System.out.println("An account has been opened under " + acc.getName() + ". Your account number is " + acc.getAccountNumber() + " Use [6] to review your information.\n");
                break;
            case 2:
            	System.out.println();
            	System.out.println("Choice: [2] View bank information.");
            	System.out.println(bank.bankInfo());
            	break;
            case 3:
            	System.out.println();
            	System.out.println("Choice: [4] Search for an account");
            	//search here
            	System.out.println("What account [ID] would you like to view?");
            	String accountNum = scanner.nextLine();
            	System.out.println();
            	if(searchAccount(bank, accountNum))
            	{
            		Accounts fetchedAcc = getAccount(bank, accountNum);
            		System.out.println("Please enter the master pin.");
            		if(!bank.getMasterPin().equals(scanner.nextLine())) 
            		{
            			System.out.println("You have entered an incorrect pin. Please restart and try again.\n");
            		}
            		else
            		{
            			System.out.println("Welcome administrator!");
                		System.out.println(fetchedAcc);
            		}
            	}
            	else
            	{
            		System.out.println("The account number you have entered [" + accountNum + "] is invalid. Please restart and try again.\n");
            	}
            	break;
            case 4:
            	System.out.println();
            	System.out.println("Choice: [5] Login");
            	String userAccNum, userPass;
            	System.out.print("Please enter your account number: ");
            	userAccNum = scanner.nextLine();
            	if(searchAccount(bank, userAccNum))
            	{
            		System.out.print("Enter the password for [" + userAccNum + "]: ");
            		userPass = scanner.nextLine();
            		System.out.println();
            		if(!validatePassword(bank, userAccNum, userPass)) 
            		{
            			System.out.println("You have entered an incorrect password. Please restart and try again.\n");
            		}
            		else
            		{
            			Accounts userAcc = getAccount(bank, userAccNum);
            			do
            			{
                			welcomeUser(bank);
                			System.out.print("Enter your choice: ");
                			choice = Integer.parseInt(scanner.nextLine());
                			switch(choice)
                			{
                			case 1:
                				System.out.println("Choice: [1] View account information\n");
                				System.out.println(userAcc);
                				break;
                			case 2:
                				System.out.println("Choice: [2] Make a deposit");
                				userAcc.deposit();
                				break;
                			case 3:
                				System.out.println("Choice: [3] Make a withdrawal");
                				userAcc.withdraw();
                				break;
                			case 4:
                				//transfer funds
                				break;
                			case 5:
                				//edit account info
                				System.out.println("Current account information:");
                				System.out.println("[1] Name: " + userAcc.getName());
                				System.out.println("[2] Account Type: " + userAcc.getAccountType());
                				System.out.println("[3] Address: " + userAcc.getAddress());
                				System.out.println("[4] Phone Number: " + userAcc.getPhoneNumber() + "\n\n");
                				System.out.print("What field would you like to change? "); 
                				choice = Integer.parseInt(scanner.nextLine());
                				switch(choice)
                				{
                				case 1:
                					System.out.println("What should the new name on the account be?");
                					name = scanner.nextLine();
                					userAcc.setName(name);
                					System.out.println("Your name has successfully been updated to: " + name + ".\n");
                					break;
                				case 2:
                					System.out.println("What should the new account type be?");
                					accountType = scanner.nextLine();
                					while (!accountType.equals("Chequing") && !accountType.equals("Savings") && !accountType.equals("MMA") && !accountType.equals("CD"))
                					{
                						System.out.print("The account type you have entered [" + accountType + "] is invalid. Please choose from the following: [Chequing, Savings, MMA, CD]. ");
                						accountType = scanner.nextLine();
                					}
                					userAcc.setAccountType(accountType);
                					System.out.println("Your account type has now been changed to: " + accountType + ".\n");
                					break;
                				case 3:
                					System.out.println("What should the new address be?");
                					address = scanner.nextLine();
                					userAcc.setAddress(address);
                					System.out.println("Your address has successfully been updated to: " + address + ".\n");
                					break;
                				case 4: 
                					System.out.println("What should the new phone number on the account be?");
                					phoneNumber = scanner.nextLine();
                					userAcc.setPhoneNumber(phoneNumber);
                					System.out.println("Your phone number has successfully been updated to: " + phoneNumber + ".\n");
                					break;
                				case 6:
                					//transfer funds, remove elements seen here from the 1st gui
                					break;
                				default:
                					System.out.println("You have entered an invalid choice. Please try again.\n");
                				}
                				break;
                			case 6:
                				System.out.println("Choice: [6] Change password");
                				userAcc.changePassword();
                				break;
                			case 7:
                				System.out.println("Choice: [7] View transactions");
                				System.out.println("Transactions:\n\n");
                        		System.out.println(userAcc.actionList());
                        		break;
                			case 8:
                				System.out.println("You have successfully been logged out.");
                				break;
                			default:
                				System.out.println("You have entered an invalid choice. Please try again.\n");
                			}
            			} while(choice != 8);
            		}
            	}
            	else
            	{
            		System.out.println("The account number you have entered [" + userAccNum + "] is invalid. Please restart and try again.\n");
            	}
            	System.out.println();
            	break;
            case 5:
            	System.out.println("Choice: [6] Login as administrator");
            	//login as admin
            	System.out.println("Enter " + bank.getName() + "'s master pin.");
            	if(!scanner.nextLine().equals(bank.getMasterPin()))
            	{
            		System.out.println("You have entered an incorrect password. Please restart and try again.\n");
            	}
            	else
            	{	
            		do
            		{
            			System.out.println();
            			welcomeAdmin(bank);
            			System.out.print("Enter your choice: ");
            			choice = Integer.parseInt(scanner.nextLine());
            			System.out.println();
            			switch(choice)
            			{
            			case 1:
            				System.out.println("Choice: [1] View all accounts");
            				System.out.println(bank.accountList());
            				break;
            			case 2:
            				System.out.println("Choice: [2] Delete an account");
            				System.out.print("What ID would you like to remove? ");
            				accountNumber = scanner.nextLine();
            				for(int i = 0; i < bank.accountAL().size(); i++)
            				{
            					if(bank.accountAL().get(i).getAccountNumber().equals(accountNumber))
            					{
            						bank.removeAccount(bank.accountAL().get(i));
            						System.out.println("The account " + accountNumber + " has been deleted.");
            					}
            				}
            				break;
            			case 3: 
            				System.out.println("Choice: [3] View recent transactions");
            				str = "";
            				for(int i = 0; i < bank.accountAL().size(); i++)
            				{
            					str = str + bank.accountAL().get(i).actionList();
            				}
            				System.out.println(str);
            				break;
            			case 4:
            				System.out.println("Choice: [4] Search for an account");
            				System.out.print("What ID would you like to view? ");
            				accountNumber = scanner.nextLine();
            				if(searchAccount(bank, accountNumber))
            				{
            					System.out.println(getAccount(bank, accountNumber));
            				}
            				else
            				{
            					System.out.println("The account number you have entered [" + accountNumber + "] is invalid. Please restart and try again.\n");
            				}
            				break;
            			case 5:
            				System.out.println("You have successfully been logged out.");
            				break;
            			default:
            				System.out.println("You have entered an invalid choice. Please try again.\n");
            			}
            		} while(choice != 5);
            	}
            	break;
            case 6:
            	System.out.println();
            	System.out.println("Thank you for using " + bank.getName() + " today!");
            	break;
            default:
            	System.out.println("You have entered an invalid choice. Please try again.\n");
            }
        }
        while (choice != 6);
	}//end main()
	public static Accounts createAccount()
	{
		Accounts acc = new Accounts();
		String accNo = "", accType = "";
		//Scanner scanner = new Scanner(System.in);
		System.out.print("What name would you like to be put on the account? ");
		acc.setName(scanner.nextLine());
		accNo = ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000)) + "-" + ((int)Math.floor(Math.random() * 9000 + 1000));
		acc.setAccountNumber(accNo);
		System.out.print("What type of account would you like to open? [Chequing, Savings, MMA, CD] ");
		accType = scanner.nextLine();
		while (!accType.equals("Chequing") && !accType.equals("Savings") && !accType.equals("MMA") && !accType.equals("CD"))
		{
			System.out.print("The account type you have entered [" + accType + "] is invalid. Please choose from the following: [Chequing, Savings, MMA, CD]. ");
			accType = scanner.nextLine();
		}
		acc.setAccountType(scanner.nextLine());
		System.out.print("For security purposes, what is your address? ");
		acc.setAddress(scanner.nextLine());
		System.out.print("For contact purposes, what is your phone number? ");
		acc.setPhoneNumber(scanner.nextLine());	
		System.out.println("Enter a password.");
		acc.setPassword(scanner.nextLine());
		System.out.println();
		return acc;
	}//end createAccount()
	public static void welcome(Bank bank)
	{
		System.out.println("Welcome to " + bank.getName() + "!");
		System.out.println("Please choose from one of our options to get started!");
		System.out.println("[1] Create a bank account");
		System.out.println("[2] View bank information");
		System.out.println("[3] Search for an account");
		System.out.println("[4] Login");
		System.out.println("[5] Login as administator");
		System.out.println("[6] Exit");
		System.out.print("Choice: ");
	}//end welcome()
	public static void welcomeUser(Bank bank)
	{
		System.out.println("Welcome back to " + bank.getName() + "!");
		System.out.println("Please choose from one of our options to get started!");
		System.out.println("[1] View account information");
		System.out.println("[2] Make a deposit");
		System.out.println("[3] Make a withdrawal");
		System.out.println("[4] Transfer funds");
		System.out.println("[5] Edit account information");
		System.out.println("[6] Change password");
		System.out.println("[7] View transactions");
		System.out.println("[8] Logout");
		System.out.print("Choice: ");
	}//end welcomeUser()
	public static void welcomeAdmin(Bank bank)
	{
		System.out.println("Welcome back, administrator of " + bank.getName() + ".");
		System.out.println("Choose from one of your options to begin.");
		System.out.println("[1] View all accounts");
		System.out.println("[2] Delete an account");
		System.out.println("[3] View recent transactions");
		System.out.println("[4] Search for an account");
		System.out.println("[5] Logout");
		System.out.print("Choice: ");
	}
	public static boolean searchAccount(Bank bank, String accNum)
	{
		for(int i = 0; i < bank.accountAL().size(); i++)
    	{
    		if(bank.accountAL().get(i).getAccountNumber().contentEquals(accNum)) 
    		{
    			return true;
    		}//end if loop
    	}//end for loop
		return false;
	}//end searchAccount()
	public static Accounts getAccount(Bank bank, String accNum)
	{
		int index = -1;
		for(int i = 0; i < bank.accountAL().size(); i++)
    	{
    		if(bank.accountAL().get(i).getAccountNumber().contentEquals(accNum)) 
    		{
    			index = i;
    		}//end if loop
    	}//end for loop
		return bank.accountAL().get(index);
	}//end getAccount()
	public static Bank getBank(ArrayList<Bank> arrayList, String name)
	{
		int index = -1;
		for(int i = 0; i < arrayList.size(); i++)
		{
			if(arrayList.get(i).getName().equalsIgnoreCase(name)) 
			{
				index = i;
			}
		}
		return arrayList.get(index);
	}
	public static boolean validatePassword(Bank bank, String accNum, String password)
	{
		if(searchAccount(bank, accNum) && (getAccount(bank, accNum).getPassword().equals(password)))
		{
			return true;
		}
		return false;
	}//end validatePassword()
	public static boolean validateBank(ArrayList<Bank> arrayList, String bankName)
	{
		for(int i = 0; i < arrayList.size(); i++)
		{
			if(arrayList.get(i).getName().toLowerCase().equals(bankName)) return true;
		}
		return false;
	}
	public static void printBanks(ArrayList<Bank> arrayList)
	{
		String str = "";
		for(int i = 0; i < arrayList.size(); i++)
		{
			str = str + arrayList.get(i).getName() + "\n";
		}
		System.out.println(str);
	}//end printBanks()
}//end class
