public class Dog 
{
	private int age;
	private String name;
	private String breed;
	private double aggression;
	private double hunger;
	public Dog()
	{
		age = (int)(Math.floor(Math.random() * 10 + 1));
		aggression = Math.floor(Math.random() * 10 + 1);
		hunger = Math.floor(Math.random() * 10 + 1);
	}
	public Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
		age = (int)(Math.floor(Math.random() * 10 + 1));
		aggression = Math.floor(Math.random() * 10 + 1);
		hunger = Math.floor(Math.random() * 10 + 1);
	}
	//Set Methods
	public void setAggression(double aggressionLevel)
	{
		aggression = aggressionLevel;
	}
	public void setHunger(double hungerLevel)
	{
		hunger = hungerLevel;
	}
	public void setAge(int uAge)
	{
		age = uAge;
	}
	public void setName(String uName)
	{
		name = uName;
	}
	public void setBreed(String uBreed)
	{
		breed = uBreed;
	}
	//Get Methods
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public String grtBreed()
	{
		return breed;
	}
	public double getAggression()
	{
		return aggression;
	}
	public double getHunger()
	{
		return hunger;
	}
	public String toString()
	{
		return "Name: " + name + "\n" +
				"Breed: " + breed + "\n" +
				"Age: " + age + "\n" +
				"Aggression Level: " + aggression + "\n" +
				"Hunger Level: " + hunger + "\n";
	}
}
