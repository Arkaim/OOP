public class StragedyPatternDemo {

	public static void main(String[] args){
		
		
		Student student = new Student(12,5,1,4);
	
		IsPassStStudent isPassStStudent = new IsPassStStudent() ;

		IsPassSpStudent isPassSpStudent = IsPassSpStudent.getInstance();
		
		isPassStStudent.toPass(student);
		isPassSpStudent.toPass(student);
		Demo demo = new Demo(new IsPassStStudent());
		demo.executeDemo(student);
	}
	
	
}