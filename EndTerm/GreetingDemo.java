public class GreetingDemo {
  private Greetings greetings;

  public static void setGreetingLanguage(Greetings greetings) {
    this.greetings = greetings;
  }

  public void displayGreeting() {
    greetings.greet();
  }
}
