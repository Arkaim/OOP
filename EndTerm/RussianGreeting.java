public class RussianGreeting implements Greetings {

  private static RussianGreeting instance = null;

  public static RussianGreeting getInstance() {
    if (instance == null) {
      instance = new RussianGreeting();
    } else {
      return instance;
    }
  }

  @Override
  public void greet() {
    System.out.println("Dratuti");
  }

}
