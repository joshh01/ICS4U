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



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Files 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner file = new Scanner(new File("info.txt"));
		ArrayList<String> averages = new ArrayList<String>();
		ArrayList<String> usernames = new ArrayList<String>();
		ArrayList<String> passwords = new ArrayList<String>();
		while(file.hasNext())
		{
			averages.add(file.nextLine().trim());
		}
		printArr(averages);
		pass(averages, usernames, passwords);
		System.out.println("USERNAMES: \n" + usernames);
		System.out.println("PASSWORDS: \n" + passwords);
		
		System.out.println("\nRemoving #2:\n");
		removeAccount(usernames, passwords, "marino");
		System.out.println("USERNAMES: \n" + usernames);
		System.out.println("PASSWORDS: \n" + passwords);
		System.out.println();
		System.out.print("Enter your username: ");
		String user = scanner.nextLine();
		System.out.print("Enter your password: ");
		String pass = scanner.nextLine();
		login(usernames, passwords, user, pass);
		scanner.close();
		file.close();
	}
	public static void printArr(ArrayList<String> arr)
	{
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
	}
	public static void pass(ArrayList<String> arr, ArrayList<String> usernames, ArrayList<String> passwords)
	{
		int colonIndex = -1;
		String password, username, data;
		for(int i = 0; i < arr.size(); i++)
		{
			data = arr.get(i);
			for(int j = 0; j < data.length(); j++)
			{
				if(arr.get(i).charAt(j) == ':')
				{
					colonIndex = j;
				}
			}
			username = data.substring(0, colonIndex);
			password = data.substring(colonIndex + 1, data.length());
			System.out.println();
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			System.out.println();
			usernames.add(username);
			passwords.add(password);
		}
	}
	public static void removeAccount(ArrayList<String> usernames, ArrayList<String> passwords, String username)
	{
		if(usernames.size() == passwords.size())
		{
			for(int i = 0; i < usernames.size(); i++)
			{
				if(usernames.get(i).contentEquals(username))
				{
					usernames.remove(i);
					passwords.remove(i);
				}
			}
		}
		else
		{
			System.out.println("There is an error with the lengths of the lists.");
		}
	}
	public static void login(ArrayList<String> usernames, ArrayList<String> passwords, String username, String password)
	{
		int userIndex = -1;
		boolean foundUser = false;
		for(int i = 0; i < usernames.size(); i++)
		{
			if(usernames.get(i).equals(username))
			{
				foundUser = true;
				userIndex = i;
			}
		}
		if(foundUser)
		{
			if(passwords.get(userIndex).equals(password))
			{
				System.out.println("Successfully logged in.");
			}
			else
			{
				System.out.println("The password you have entered is incorrect.");
			}
		}
		else
		{
			System.out.println("The username you have entered [" + username + "] is invalid.");
		}
	}
}
