public class Context
{
	private Greeting greeting;

	public Context(Greeting greeting)
	{
		this.greeting = greeting;
	}

	public String doGreeting(String name)
	{
		return greeting.greet(name);
	}
}