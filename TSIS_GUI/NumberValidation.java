public class NumberValidation implements Strategy{

	@Override
	 bool isValid(String str) {
		 {
     try
     {
       double d = Double.parseDouble(str);
     }
     catch(NumberFormatException nfe)
     {
       return false;
     }
     return true;
   }
	}
}
