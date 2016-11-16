/**
 * Class <code>Student</code>. It extends class Person.
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see Student
 */
public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student (String name, String address, String program,
	int year, double fee) {
		this.name = name;
		this.address = address;
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	/**
	 * Returns a program of a student
	 *
	 * @return program of specified Student
	 */
	public String getProgram() {
		return program;
	}
	/**
	 * Sets the program
	 * @param program to set in string
	 */
	public void setProgram(String program) {
		this.program = program;
	}
	/**
	 * Returns a year of a given student
	 *
	 * @return year of specified Student
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Sets the year
	 * @param year to set in integer
	 */
	public void setYear (int year) {
		this.year= year;
	}
	/**
	 * Returns a fee of a student
	 *
	 * @return fee of specified Student
	 */
	public double getFee (){
		return fee;
	}
	/**
	 * Sets the fee
	 * @param fee to set in double
	 */
	public void setFee (double fee){
		this.fee = fee;
	}
	/**
	 * Override the toString() methods 
	 * @return string with data
	 */	
	public String toString () {
		return (super.toString() +
				+this.getProgram()"," +this.getYear() ","+ this.getFee()"]");
	}
	/**
	 * Calls the parent constructor with no arguments. 
	 * @return string with data
	 */	

}