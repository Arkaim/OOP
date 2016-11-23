import java.util.*;

public class IsPassSpStudent implements IsPass{
	
	private static IsPassSpStudent instance = null;
	

	
	private IsPassSpStudent(){
	}

	public static IsPassSpStudent getInstance(){
		
		if(instance == null){
			
			instance = new IsPassSpStudent();
			
		}
		
		return instance;
	}
	
	public void toPass(Student student){
		
		double calcSpGPA = (student.getGPA1() + student.getGPA2())/2;
		
		if(calcSpGPA > 2.5){
			System.out.println("Congratulations");
		}else{
			System.out.println("Sorry, you can not pass");
		}
	} 
}