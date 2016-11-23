public class Demo{
	private IsPass isPass;

	public  Demo(IsPass isPass){
		this.isPass = isPass;
	}
	public void executeDemo(Student student){
		isPass.toPass(student);
	}
}