public class EnglishGreeting implements Greeting
{
	private static EnglishGreeting instance = new EnglishGreeting();

	private EnglishGreeting(){}

	public static EnglishGreeting getInstance()
	{
		return instance;
	}

	@Override
	public String greet(String name)
	{
		return "Hello, " + name + "!";
	}
}