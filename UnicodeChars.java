/*
 * Joshua de Souza
 * February 1, 2022
 * U1 A2 Q1: Unicode Characters
 * Program lists A-Z, a-z and 0-9.
 */
public class UnicodeChars 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initialization
		char i;
		System.out.print("Uppercase letters | ");
		for(i = 'A'; i <= 'Z'; i++) 
		{
			System.out.print(i);
		}
		System.out.println(" ");
		System.out.print("Lowercase letters | ");
		for(i = 'a'; i <= 'z'; i++) 
		{
			System.out.print(i);
		}
		System.out.println(" ");
		System.out.print("Numbers | ");
		for(i = '0'; i <= '9'; i++) 
		{
			System.out.print(i);
		}
	}//end main
}//end class

/*
 * ALTERNATE METHOD USING STRINGS
 * String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaseLetters = uppercaseLetters.toLowerCase();
		String numbers = "0123456789";
		System.out.print("Uppercase letters | ");
		for(int i = 0; i < uppercaseLetters.length(); i++) 
		{
			System.out.print(uppercaseLetters.charAt(i));
		}
		System.out.println(" ");
		System.out.print("Lowercase letters | ");
		for(int i = 0; i < lowercaseLetters.length(); i++) 
		{
			System.out.print(lowercaseLetters.charAt(i));
		}
		System.out.println(" ");
		System.out.print("Numbers | ");
		for(int i = 0; i < numbers.length(); i++) 
		{
			System.out.print(numbers.charAt(i));
		}
		System.out.println(" ");
		System.out.println(" ");
 */
