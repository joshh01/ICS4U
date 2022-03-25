import java.util.Scanner;
public class DogClient 
{
	public static void main(String[] args) 
	{
		String name, breed;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Two dogs will be created.");
		System.out.println("What is the name of the first dog?");
		name = scanner.nextLine();
		System.out.println("What breed is " + name + " ?");
		breed = scanner.nextLine();
		Dog firstDog = new Dog(name, breed);
		System.out.println("What is the name of the second dog?");
		name = scanner.nextLine();
		System.out.println("What breed is " + name + " ?");
		breed = scanner.nextLine();
		Dog secondDog = new Dog(name, breed);
		System.out.println();
		System.out.println("Printing dog information.");
		System.out.println(firstDog);
		System.out.println(secondDog);
		System.out.println("Confirm (Y) or Change (C) " + firstDog.getName() + "'s aggression level? ");
		System.out.println("Aggression level: " + firstDog.getAggression());
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new aggression level to be? [1-10]");
			firstDog.setAggression(scanner.nextDouble());
		}
		System.out.println(firstDog.getName() + "'s aggression level is now set to " + firstDog.getAggression() + ".");
		System.out.println("Confirm (Y) or Change (C) " + secondDog.getName() + "'s aggression level? ");
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new aggression level to be? [1-10]");
			secondDog.setAggression(scanner.nextDouble());
		}
		System.out.println(secondDog.getName() + "'s aggression level is now set to " + secondDog.getAggression() + ".");
		//System.out.println(firstDog);
		scanner.close();
	}
}
