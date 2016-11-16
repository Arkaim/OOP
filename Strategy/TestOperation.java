import java.util.*;
public class TestOperation{

	public static void main(String[] args) {
		
		Context context = new Context();
		context.setOperation(new OperationAdd());
		System.out.println(context.displayOperation());

		context.setOperation(new OperationMulti());
		System.out.println(context.displayOperation());

	}
}