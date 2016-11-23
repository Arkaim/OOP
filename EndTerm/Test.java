import java.util.*;
public class Test {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		GreetingDemo greetingDemo;
		String name = "Islam";
    for (int i = 0; i < 100; i++)
		{
			System.out.println();
			System.out.println("[0] Quit");
			System.out.println("[1] Greet in Kazakh");
			System.out.printl  n("[2] Greet in English");
			System.out.println("[3] Greet in Russian");
			System.out.println();

			int choice = scan.nextInt();

			if (choice == 0) {
				break;
			}	else if (choice == 1) {
        KazakhGreeting kazah = KazakhGreeting.getInstance();
				greetingDemo = GreetingDemo.setGreetingLanguage(kazah);
				greetingDemo.displayGreeting();
        System.out.print(" " + name);
			}

			else if (choice == 2)
			{
        EnglishGreeting eng = EnglishGreeting.getInstance();
				greetingDemo = GreetingDemo.setGreetingLanguage(eng);
				greetingDemo.displayGreeting();
        System.out.print(" " + name);
			}

			else if (choice == 3)
			{
        RussianGreeting rus = RussianGreeting.getInstance();
				greetingDemo = GreetingDemo.setGreetingLanguage(rus);
				greetingDemo.displayGreeting();
        System.out.print(" " + name);
			}
		}
	}
}
