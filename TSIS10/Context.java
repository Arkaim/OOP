package tsis9;

public class Context {
	private Strategy strategy;
	
	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public boolean executeStrategy(String input){
	      return strategy.isValid(input);
	   }
}
