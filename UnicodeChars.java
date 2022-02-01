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
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaseLetters = uppercaseLetters.toLowerCase();
		String numbers = "0123456789";
		for(int i = 0; i < uppercaseLetters.length(); i++) 
		{
			System.out.println(uppercaseLetters.charAt(i));
		}
		for(int i = 0; i < lowercaseLetters.length(); i++) 
		{
			System.out.println(lowercaseLetters.charAt(i));
		}
		for(int i = 0; i < numbers.length(); i++) 
		{
			System.out.println(numbers.charAt(i));
		}
		
		char z;
		for(z = 'A'; z <= 'Z'; z++) 
		{
			System.out.println(z);
		}
		for(z = 'a'; z <= 'z'; z++) 
		{
			System.out.println(z);
		}
		for(z = '0'; z <= '9'; z++) 
		{
			System.out.println(z);
		}
	}//end main
}//end class
