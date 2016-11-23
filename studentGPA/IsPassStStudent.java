import java.util.*;

public class IsPassStStudent implements IsPass{
	
	
	public IsPassStStudent(){
		
	}
	
	public void toPass(Student student){
		
		double calcGPA = (student.getGPA1() + student.getGPA2() + student.getGPA3())/3;
		
		if(calcGPA > 2){
			System.out.println("Congratulatons");
		}else{
			System.out.println("Sorry, your GPA is too low");
		}
	}
}