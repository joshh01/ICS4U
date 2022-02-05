/*
 * Joshua de Souza
 * February 2, 2022
 * U1 A2 Q4: Palindrome2
 * Program checks if there are any palindromes in a given sentence, and counts them if there are any.
 */
import javax.swing.JOptionPane;
public class Palindrome2 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initialization
		int counter = 0;
		String reversedWord = "", palindromes = "", userSentence = JOptionPane.showInputDialog("Words which are spelt the same forwards and backwards are called palindromes. \nThis program determines how many palindromes are in your sentence.\n\nPlease enter a sentence (without using punctuation):");
		String[] brokenSentence = userSentence.split(" ");
		if(userSentence.equals("")) 
		{
			System.out.println("You have entered an empty message.");
			return;
		}
		//Splits the one sentence into separate words
		//Loops through each word
		for(String words : brokenSentence) 
		{
			if(words.length() > 1) 
			{
				for(int i = words.length() - 1; i >= 0; i--) 
				{
					reversedWord = reversedWord + words.charAt(i);
				}
				if(words.toLowerCase().contentEquals(reversedWord.toLowerCase())) 
				{
					counter = counter + 1;
					//Puts palindromes into a list, adding commas if there is already a list
					if(palindromes.contentEquals("")) 
					{
						palindromes = palindromes + words;
					} 
					else 
					{
						palindromes = palindromes + ", " + words;
					}
				} 
				reversedWord = "";
			}
		}
		//Printing results
		System.out.println("Your sentence: " + userSentence);
		System.out.println("Number of palindromes: " + counter);
		System.out.println("Valid palindromes: " + palindromes);
		//Popup results changing grammar based on count of palindromes
		if(counter > 1 || counter == 0) 
		{
			JOptionPane.showMessageDialog(null, 
	                "There are " + counter + " palindromes in your sentence.", 
	                "Count", 
	                JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, 
	                "The palindromes are: " + palindromes, 
	                "Words", 
	                JOptionPane.PLAIN_MESSAGE);
		} 
		else if (counter == 0) 
		{
			JOptionPane.showMessageDialog(null, 
	                "There are " + counter + " palindromes in your sentence.", 
	                "Count", 
	                JOptionPane.PLAIN_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, 
	                "There is " + counter + " palindrome in your sentence.", 
	                "Count", 
	                JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, 
	                "The palindrome is: " + palindromes, 
	                "Words", 
	                JOptionPane.PLAIN_MESSAGE);
		}
	}//end main
}//end class
