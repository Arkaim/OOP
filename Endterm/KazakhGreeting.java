public class KazakhGreeting implements Greeting
{
	private static KazakhGreeting instance = new KazakhGreeting();

	private KazakhGreeting(){}

	public static KazakhGreeting getInstance()
	{
		return instance;
	}

	@Override
	public String greet(String name)
	{
		return ("Salem, " + name + "!");
	}
}
