/*
 * Joshua de Souza
 * January 31, 2022
 * U1 A1 Q3: Rounding Error
 * Program compares the square of the square root of a number to the original number.
 */
import javax.swing.JOptionPane;
public class RoundingError 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initialization
		double number, rootNumber, numberSquared, difference;
		String userInput;
		userInput = JOptionPane.showInputDialog("Please enter a number.");
		number = Double.parseDouble(userInput);
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
