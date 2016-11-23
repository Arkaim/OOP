public class RussianGreeting implements Greeting
{
	private static RussianGreeting instance = new RussianGreeting();

	private RussianGreeting(){}

	public static RussianGreeting getInstance()
	{
		return instance;
	}
	
	@Override
	public String greet(String name)
	{
		return "Privet, " + name + "!";
	}
}