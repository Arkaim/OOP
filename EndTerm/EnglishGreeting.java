public class EnglishGreeting implements Greetings {

  private static EnglishGreeting instance = null;

  public static EnglishGreeting getInstance() {
    if (instance == null) {
      instance = new EnglishGreeting();
    } else {
      return instance;
    }
  }
  
  @Override
  public void greet() {
    System.out.println("Hello");
  }

}
