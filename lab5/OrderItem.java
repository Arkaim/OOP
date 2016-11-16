import java.io.*;
/**
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see OrderItem
 */
public class OrderItem{
	private Product product;
	private int quantity;

	/**
	* @param Product initialProduct, int initialQuantity.
	*Constructor that initializes the instance variables
	*product and quantity .
	*/

	public OrderItem(Product initialProduct, int initialQuantity) {
		this.product = initialProduct;
		this.quantity = initialQuantity;
	}

	/**
	* @return the product
	*/

	public Product getProduct() {
		return this.product;
	}

	/**
	* @return the quantity of product
	*/

	public int getQuantity() {
		return this.quantity;
	}

	/**
	* Sets the instance variable quantity to the valueof parameter newQuantity .
	*/

	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}

	/**
	* @return the value of instance variable origin.
	*/

	public double getValue() {
		return this.quantity * this.product.getPrice();
	}

	/**
	*Overrides the method toString in the class Object . Returns the string
	*representation of an OrderItem object.
	* @return the string with quantity, code and price.
	*/

	public String toString() {
		return (this.getQuantity() + " " + this.product.getCode() + " " + this.product.getPrice());
	}
}