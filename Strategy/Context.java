import java.util.*;
public class Context{
	Operation operation;

	public void setOperation(Operation initOperation){

		this.operation = initOperation;
	}
	public int displayOperation () {
		
		return this.operation.doOperation();
	}
}