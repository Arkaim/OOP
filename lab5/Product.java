import java.io.*;
/**
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see Product
 */
public class Product {
	private String code;
	private String description;
	private double price;

	public Product(String initialCode, String initialDescription, double initialPrice) {
	
		this.code = initialCode;
		this.description = initialDescription;
		this.price = initialPrice;
	}
	/**
	* @  Returns the value of instance variable code .
	*/
	public String getCode() {
		return this.code;
	}

	/**
	* @  eturns the value of instance variable description .
	*/

	public String getDescription() {
		return this.description;
	}

	/**
	* @ Returns the value of instance variable price .
	*/

	public double getPrice() {
		return this.price;
	}

	/**
	*  Overrides the method equals in the class Object . Two Product objects are equal if their codes are equal.
	*@param Object object
	*@return the boolean expression represents are they equal
	*/


	public boolean equals(Object object) {

		if(object instanceof Product) {
			Product product = (Product)object;
			return this.getCode() == product.getCode();
		}
		else {
			return false;
		}
	} 

	/**
	* @  Overrides the method toString in the class Object . Returns the string representation of a Product object.
	*/         

	public String toString() {
		return (this.getCode() + "_" + this.getDescription() + "_" + this.getPrice());
	}
}
