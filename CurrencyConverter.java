import java.util.Scanner;
public class CurrencyConverter {
	public static void main(String[] args) {
		double amountConverted, newAmount;
		String originalCurrency, newCurrency;
		String currencies = "CAD, USD, RUPEE";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Available currencies: " + currencies);
		System.out.println("What currency would you like to convert? ");
		originalCurrency = input.nextLine();
		while(!currencies.contains(originalCurrency.toUpperCase())) {
			System.out.println("Invalid type. Try again.");
			System.out.println("What currency would you like to convert? ");
			originalCurrency = input.nextLine();
		}
		
		System.out.println("What currency would you like to convert " + originalCurrency.toUpperCase() + " to? ");
		newCurrency = input.nextLine();
		while(!currencies.contains(newCurrency.toUpperCase())) {
			System.out.println("Invalid type. Try again.");
			System.out.println("What currency would you like to convert " + originalCurrency.toUpperCase() + " to? ");
			newCurrency = input.nextLine();
		}
		
		while(newCurrency.toLowerCase().equals(originalCurrency.toLowerCase())) {
			System.out.println("Your currency (" + newCurrency.toUpperCase() + ") was repeated. Please try again.");
			System.out.println("Available currencies: " + currencies);
			System.out.println("What currency would you like to convert? ");
			originalCurrency = input.nextLine();
			while(!currencies.contains(originalCurrency.toUpperCase())) {
				System.out.println("Invalid type. Try again.");
				System.out.println("What currency would you like to convert? ");
				originalCurrency = input.nextLine();
			}
			
			System.out.println("What currency would you like to convert " + originalCurrency.toUpperCase() + " to? ");
			newCurrency = input.nextLine();
			while(!currencies.contains(newCurrency.toUpperCase())) {
				System.out.println("Invalid type. Try again.");
				System.out.println("What currency would you like to convert " + originalCurrency.toUpperCase() + " to? ");
				newCurrency = input.nextLine();
			}
		}
		
		System.out.println("How much (in " + originalCurrency.toUpperCase() + ") would you like to convert?");
		amountConverted = input.nextDouble();
		while(amountConverted <= 0) {
			System.out.println("Invalid amount. Try again.");
			System.out.println("How much (in " + originalCurrency.toUpperCase() + ") would you like to convert?");
			amountConverted = input.nextDouble();
		}
		
		System.out.println("Converting " + amountConverted + " " + originalCurrency.toUpperCase() + " to: " + newCurrency.toUpperCase());
		for(int i = 0; i <= 2; i++) {
			try
			{
				Thread.sleep(1100);
			}
			catch(InterruptedException ex)
			{
		    	Thread.currentThread().interrupt();
			}
			System.out.print(". ");
		}
		try {
			Thread.sleep(3000);;
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("");
		
		//Canadian Dollars
		if(originalCurrency.toLowerCase().equals("cad") && newCurrency.toLowerCase().equals("usd")) {
			newAmount = amountConverted * 0.78;
			System.out.println("$" + amountConverted + " CAD = " + "$" + newAmount + " USD.");
		} 
		if(originalCurrency.toLowerCase().equals("cad") && newCurrency.toLowerCase().equals("rupee")) {
			newAmount = amountConverted * 58.51;
			System.out.println(amountConverted + " RUPEE = " + "$" + newAmount + " CAD.");
		}
		
		//United States Dollars
		if(originalCurrency.toLowerCase().equals("usd") && newCurrency.toLowerCase().equals("cad")) {
			newAmount = amountConverted * 58.51;
			System.out.println("$" + amountConverted + " USD = " + "$" + newAmount + " CAD.");
		}
		if(originalCurrency.toLowerCase().equals("usd") && newCurrency.toLowerCase().equals("rupee")) {
			newAmount = amountConverted * 74.64;
			System.out.println("$" + amountConverted + " USD = " + newAmount + " RUPEE.");
		}
		
		//Indian Rupees
		if(originalCurrency.toLowerCase().equals("rupee") && newCurrency.toLowerCase().equals("cad")) {
			newAmount = amountConverted * 0.017;
			System.out.println(amountConverted + " RUPEE = " + "$" + newAmount + " CAD.");
		}
		if(originalCurrency.toLowerCase().equals("rupee") && newCurrency.toLowerCase().equals("usd")) {
			newAmount = amountConverted * 0.013;
			System.out.println(amountConverted + " RUPEE = " + "$" + newAmount + " CAD.");
		}
	}
}
