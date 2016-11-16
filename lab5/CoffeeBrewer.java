import java.io.*;
/**
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see CoffeeBrewer
 */
public class CoffeeBrewer extends Product{
	private String model;
	private String waterSupply;
	private int numberOfCups;
	/**
	*Constructor that initializes the instance variables
	*and
	*code , description , price , model , waterSupply ,
	*numberOfCups .
	*/
	public CoffeeBrewer(String initialCode,
						 String initialDescription,
						 double initialPrice,
						 String initialModel,
						 String initialWaterSupply,
						 int initialNumberOfCups) {
		super(initialCode, initialDescription, initialPrice);
		this.model = initialModel;
		this.waterSupply = initialWaterSupply;
		this.numberOfCups = initialNumberOfCups;
	}

	/**
	*@Returns the value of instance variable model.
	*/
	public String getModel() { 
		return this.model;
	}

	/**
	*@Returns the value of instance variable waterSupply.
	*/
	public String getWaterSupply() {
		return this.waterSupply;
	}

	/**
	*@Returns the value of instance variable numberOfCups.
	*/
	public int getNumberOfCups() { 
		return this.numberOfCups;
	}
	
	/**
	*@Overrides the method toString in the class Object. Returns the string
	*		representation of a CoffeeBrewer object.
	*/
	public String toString() {
		return (this.getCode() + "_" + this.getDescription() + "_" + this.getPrice() + "_" 
				+ this.getModel() + "_" + this.getWaterSupply() + "_" + this.getNumberOfCups());
	}
}