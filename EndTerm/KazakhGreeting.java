/**
 * Class <code>KazakhGreeting</code>.
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see KazakhGreeting
 */

public class KazakhGreeting implements Greetings {

  private static KazakhGreeting instance = null;
  /**
  *@ Using Singleton Pattern, create an instance of KazakhGreeting
  */
  public static KazakhGreeting getInstance() {
    if (instance == null) {
      instance = new KazakhGreeting();
    } else {
      return instance;
    }
  }

  /**
  *@ Overrides the method greet() from the Greetings class
  */
  @Override
  public void greet() {
    System.out.println("Salem");
  }

}
