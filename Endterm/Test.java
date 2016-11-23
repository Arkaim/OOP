import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Context context;
		String name = "Islam";
		for (int i=0; i<100; i++)
		{
			System.out.println();
			System.out.println("[0] Quit");
			System.out.println("[1] Greet in Kazakh");
			System.out.println("[2] Greet in English");
			System.out.println("[3] Greet in Russian");
			System.out.print("choice> ");
			System.out.println();

			int choice = scan.nextInt();

			if (choice == 0)
			{
				break;
			}

			else if (choice == 1)
			{;
				context = new Context(KazakhGreeting.getInstance());

				System.out.println(context.doGreeting(name));
			}

			else if (choice == 2)
			{
				context = new Context(EnglishGreeting.getInstance());

				System.out.println(context.doGreeting(name));
			}

			else if (choice == 3)
			{
				context = new Context(RussianGreeting.getInstance());

				System.out.println(context.doGreeting(name));
			}
		}
	}
}
