import java.io.*;
/**
 * Test driver for class <code>Coffee</code>.
 *
 * @author  iKaimbayev
 * @version  1.0.0
 * @see Coffee
 */
public class Coffee extends Product{
	private String origin;
	private String roast;
	private String flavor;
	private String aroma;
	private String acidity;
	private String body;
	/**
	*Constructor that initializes the instance variables code , description , price , origin , roast , flavor , aroma , acidity , and body .
	*/
	public Coffee(String initialCode,
					String initialDescription,
					double initialPrice,
					String initialOrigin,
					String initialRoast,
					String initialFlavor,
					String initialAroma,
					String initialAcidity,
					String initialBody) {
		super(initialCode, initialDescription, initialPrice);
		this.origin = initialOrigin;
		this.roast = initialRoast;
		this.flavor = initialFlavor;
		this.aroma = initialAroma;
		this.acidity = initialAcidity;
		this.body = initialBody;
	}

	/**
	* @  Returns the value of instance variable origin.
	*/
	public String getOrigin() { 
		return this.origin;
		}

	/**
	*@ Returns the value of instance variable roast.
	*/
	public String getRoast() { 
		return this.roast;
	}

	/**
	*@ Returns the value of instance variable flavor.
	*/
	public String getFlavor() { 
		return this.flavor;
	}

	/**
	*@Returns the value of instance variable aroma.
	*/
	public String getAroma() { 
		return this.aroma;
	}

	/**
	*@ Returns the value of instance variable acidity.
	*/
	public String getAcidity() { 
		return this.acidity;
	}

	/**
	*@ Returns the value of instance variable body.
	*/
	public String getBody() { 
		return this.body;
	}

	/**
	*@ Overrides the method toString in the class Object. Returns the string
	*									representation of a Coffee object..
	*/
	public String toString() {
		return (this.getCode() + "_" + this.getDescription() + "_" 
				+ this.getPrice() + "_" + this.getOrigin() + "_" 
				+ this.getRoast() + "_" + this.getFlavor() + "_"
				+ this.getAroma() + "_" + this.getAcidity() + "_" 
				+ this.getBody());
	}
}