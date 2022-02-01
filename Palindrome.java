/*
 * Joshua de Souza
 * February 1, 2022
 * U1 A2 A3: Palindrome
 * Program checks if a word is a palindrome. 
 */
import javax.swing.JOptionPane;
public class Palindrome 
{
	public static void main(String[] args) 
	{	
		String userWord = JOptionPane.showInputDialog("Words which are spelt the same forwards and backwards are called palindromes. \nThis program determines if a word is a palindrome.\n\nPlease enter a word:");
		String reversedWord = "";
		for(int i = userWord.length() - 1; i >= 0; i--) 
		{
			reversedWord = reversedWord + userWord.charAt(i);
		}
		if(reversedWord.equals("")) 
		{
			System.out.println("You have entered an empty message.");
			return;
		}
		System.out.println("Word spelt forwards: " + userWord);
		System.out.println("Word spelt backwards: " + reversedWord);
		if(userWord.toLowerCase().equals(reversedWord.toLowerCase())) 
		{
			System.out.println("The word " + userWord + " is a palindrome.");
		} 
		else 
		{
			System.out.println("The word " + userWord + " is not a palindrome.");
		}		
	}//end main
}//end class
