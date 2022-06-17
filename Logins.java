/*
 * Program is used to test logins.
 * Primary focuses: file reading, string methods, real-world applications
 */
import javax.swing.*;
import java.util.ArrayList;
public class Logins 
{
	public static void main(String[] args) 
	{
		ArrayList<String> usernames = new ArrayList<String>();
		usernames.add("josh");
		ArrayList<String> passwords = new ArrayList<String>();
		passwords.add("JavaRocks!");
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		Object[] message = 
		{
		    "Username:", username,
		    "Password:", password
		};
		
		int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) 
		{
		    if (username.getText().equals("joshh01") && password.getText().equals("JavaRocks")) 
		    {
		        System.out.println("Login successful");
		        System.out.println("hack");
		    } 
		    else 
		    {
		        System.out.println("login failed");
		    }
		} 
		else 
		{
		    System.out.println("Login canceled");
		}
	}
}
