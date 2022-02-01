/*
 * Joshua de Souza
 * January 31, 2021
 * U1 A1 Q3: Rounding Error
 * Program compares the square of the square root of a number to the original number.
 */
import javax.swing.JOptionPane;
public class RoundingError 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initialization
		int number = 0;
		double rootNumber = 0, numberSquared = 0, difference = 0;
		String userInput = "";
		userInput = JOptionPane.showInputDialog("Please enter a number.");
		number = Integer.parseInt(userInput);
		if(number < 0) 
		{
			System.out.println("The number you have entered (" + number + ") is less than 0. Numbers less than 0 do not have square roots, unless using complex numbers.");
			return;
		}
		rootNumber = Math.sqrt(number);
		numberSquared = rootNumber * rootNumber;
		difference = number - numberSquared;
		System.out.println("The number you entered was: " + number + ".");
		System.out.println("The square of the square root = " + numberSquared);
		System.out.println("The round off error = " + difference);
	}//end main
}//end class