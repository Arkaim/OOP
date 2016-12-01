package tsis9;

public class EmailValidation implements Strategy {

	@Override
	public boolean isValid(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '@') {
				return true;
			}
		}
		return false;
	}

}
