public class EmailValidation implements Strategy{


	bool isValid(String userText) {
		if (userText.contains("@")) {
      return true;
    } else {
      return false;
    }
	}
}
