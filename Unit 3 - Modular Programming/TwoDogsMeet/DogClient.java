import java.util.Scanner;
public class DogClient 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		String name, breed;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Two dogs will be created.");
		System.out.print("What is the name of the first dog? ");
		name = scanner.nextLine();
		System.out.print("What breed is " + name + " ? ");
		breed = scanner.nextLine();
		Dog2 firstDog = new Dog2(name, breed);
		System.out.print("What is the name of the second dog? ");
		name = scanner.nextLine();
		System.out.print("What breed is " + name + " ? ");
		breed = scanner.nextLine();
		Dog2 secondDog = new Dog2(name, breed);
		System.out.println();
		System.out.println("Printing dog information.");
		System.out.println();
		System.out.println(firstDog);
		System.out.println(secondDog);
		//Confirm or Change aggression level
		System.out.println("Confirm (Y) or Change (C) " + firstDog.getName() + "'s aggression level? ");
		System.out.println("Aggression level: " + firstDog.getAggression());
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new aggression level to be? [1-10]");
			firstDog.setAggression(scanner.nextDouble());
			System.out.println(firstDog.getName() + "'s aggression level is now set to " + firstDog.getAggression() + ".");
		}
		System.out.println("Confirm (Y) or Change (C) " + secondDog.getName() + "'s aggression level? ");
		System.out.println("Aggression level: " + secondDog.getAggression());
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new aggression level to be? [1-10]");
			secondDog.setAggression(scanner.nextDouble());
			System.out.println(secondDog.getName() + "'s aggression level is now set to " + secondDog.getAggression() + ".");
		}
		//Confirm or Change hunger level
		System.out.println("Confirm (Y) or Change (C) " + firstDog.getName() + "'s hunger level? ");
		System.out.println("Hunger level: " + firstDog.getHunger());
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new hunger level to be? [1-10]");
			firstDog.setHunger(scanner.nextDouble());
			System.out.println(firstDog.getName() + "'s hunger level is now set to " + firstDog.getHunger() + ".");
		}
		System.out.println("Confirm (Y) or Change (C) " + secondDog.getName() + "'s hunger level? ");
		System.out.println("Hunger level: " + secondDog.getHunger());
		if(scanner.nextLine().toLowerCase().equals("c"))
		{
			System.out.println("Ok, what would you like the new hunger level to be? [1-10]");
			secondDog.setHunger(scanner.nextDouble());
			System.out.println(secondDog.getName() + "'s hunger level is now set to " + secondDog.getHunger() + ".");
		}
		System.out.println();
		scanner.close();
		twoDogsMeet(firstDog, secondDog);
	}//end main()
	public static void twoDogsMeet(Dog2 firstDog, Dog2 secondDog)
	{
		double aL1, aL2, hL1, hL2, x;
		aL1 = firstDog.getAggression();
		aL2 = secondDog.getAggression();
		hL1 = firstDog.getHunger();
		hL2 = secondDog.getHunger();
		x = Math.sqrt(((hL2 - hL1)*(hL2 - hL1)) + ((aL2 - aL1)*(aL2 - aL1)));
		if(x > 5)
		{
			System.out.println("This meeting will be aggressive.");
			if(firstDog.getAggression() > secondDog.getAggression()) {
				System.out.println(firstDog.getName() + " has retrieved the food.");
			}//end if
			else
			{
				System.out.println(secondDog.getName() + " has retrieved the food.");
			}//end else
		}//end if
		else if(x <= 5)
		{
			System.out.println("This meeting will be passive.");
		}//end else if
	}//end twoDogsMeet()
}
