/*
 * Joshua de Souza
 * February 2, 2022
 * U1 A2 Q5: Palindrome 3
 * Program determines whether a given sentence is a palindrome or not.
 */
import javax.swing.JOptionPane;
public class Palindrome3 
{
	public static void main(String[] args) 
	{
		String reversedPhrase = "", noSpacePhrase = "", noSpaceReversedPhrase = "", userPhrase = JOptionPane.showInputDialog("Words which are spelt the same forwards and backwards are called palindromes. \nThis program determines if a phrase is a palindrome.\n\nPlease enter a phrase (without using punctuation):");
		for(int i = userPhrase.length() - 1; i >= 0; i--) 
		{
			reversedPhrase = reversedPhrase + userPhrase.charAt(i);
		}
		if(reversedPhrase.equals("")) 
		{
			System.out.println("You have entered an empty message.");
			return;
		}
		System.out.println("Phrase spelt forwards: " + userPhrase);
		System.out.println("Phrase spelt backwards: " + reversedPhrase);
		noSpacePhrase = userPhrase.replaceAll(" ", "");
		noSpaceReversedPhrase = reversedPhrase.replaceAll(" ", "");
		if(noSpacePhrase.toLowerCase().equals(noSpaceReversedPhrase.toLowerCase())) 
		{
			System.out.println("The phrase " + userPhrase + " is a palindrome.");
		} 
		else 
		{
			System.out.println("The phrase " + userPhrase + " is not a palindrome.");
		}		
	}//end main
}//end class
