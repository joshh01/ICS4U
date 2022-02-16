/*
 * Joshua de Souza
 * February 13, 2022
 * U2 A2 Q6: Simple Encryption
 * Program encrypts a message using different letters.
 */
import javax.swing.JOptionPane;
public class SimpleEncryption {
	public static void main(String[] args) {
		//Variable Declarations & Initializations
		int rotationAmount;
		String encryptedMessage = "", userSentence, rotationString, choice, lowerCaseSentence;
		userSentence = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the\nsimple encryption method of rotating the letters.\n\nPlease enter a phrase:");
		rotationString = JOptionPane.showInputDialog("Enter the rotation amount (1-25):");
		choice = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");
		lowerCaseSentence = userSentence.toLowerCase();
		rotationAmount = Integer.parseInt(rotationString);
		if(rotationAmount > 25 || rotationAmount < 1)
		{
			System.out.println("You have entered an invalid rotation amount.");
			return;
		}
		if(choice.equals("1")) {
			System.out.println("ROTATION AMOUNT: " + rotationAmount);
			System.out.println("CHOICE: Encryption");
			for(int i = 0; i < lowerCaseSentence.length(); i++)
			{
				if(lowerCaseSentence.charAt(i) == ' ')
				{
					encryptedMessage = encryptedMessage + " ";
				}
				else
				{
					if((lowerCaseSentence.charAt(i) + rotationAmount) > 122)
					{
						encryptedMessage = encryptedMessage + (char)(97 + ((lowerCaseSentence.charAt(i) + rotationAmount)) - 123);
					}
					else
					{
						encryptedMessage = encryptedMessage + ((char)((lowerCaseSentence.charAt(i)) + rotationAmount));
					}
				}
			}
			System.out.println("The original phrase was: " + userSentence.toUpperCase());
			System.out.println("The encrypted phrase is: " + encryptedMessage.toUpperCase());
		}
		else if(choice.equals("2"))	
		{
			System.out.println("ROTATION AMOUNT: " + rotationAmount);
			System.out.println("CHOICE: Decryption");
			for(int i = 0; i < lowerCaseSentence.length(); i++)
			{
				if(lowerCaseSentence.charAt(i) == ' ')
				{
					encryptedMessage = encryptedMessage + " ";
				}
				else
				{
					if((lowerCaseSentence.charAt(i) - rotationAmount) < 97)
					{
						encryptedMessage = encryptedMessage + (char)(98 + (lowerCaseSentence.charAt(i) - rotationAmount) - 104);
					}
					else
					{
						encryptedMessage = encryptedMessage + ((char)((lowerCaseSentence.charAt(i)) - rotationAmount));
					}
				}
			}
			System.out.println("The original phrase was: " + userSentence.toUpperCase());
			System.out.println("The decrypted phrase is: " + encryptedMessage.toUpperCase());
		}
		else
		{
			System.out.println("You have entered an invalid choice.");
		}
	}//end main
}//end class
