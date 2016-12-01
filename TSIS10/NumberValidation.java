package tsis9;


public class NumberValidation implements Strategy {

	@Override
	public boolean isValid(String input) {
		if (isInteger(input)) {
			return true;
		}
		return false;	
	}
	
	public boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try {
	         Integer.parseInt(s);
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex) {}
	      return isValidInteger;
	}
	
}
