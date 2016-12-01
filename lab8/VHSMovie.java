import java.util.*;


/**
* The class VHSMovie extends class Movie and implements the interface VHS.
*
*@author Kaimbayev
*@version 1.0.0
*/
public class VHSMovie extends Movie implements VHS{

	private String format;
	private String language;

	public VHSMovie(String initialTitle,String[] initialActors,
					String initialDirector, String initialFormat,
					String initialLanguage){

		super(initialTitle, initialActors, initialDirector);

		this.format = initialFormat;
		this.language = initialLanguage;

	}

	/**
	 * Returns the value of the variable format.
	 *
	 * @return  the format.
	 */
	public String getFormat(){

		return this.format;

	}

	/**
	 * Returns the value of the variable language.
.
	 *
	 * @return  the language.
	 */
	public String getLanguage(){

		return this.language;

	}

	/**
	 *  Returns a string representation of the object with the following format:
	 *  title,format,language.
	 *
	 * @return  the string.
	 */
	public String toString(){

		return super.getTitle()+","+getFormat()+","+getLanguage();

	}
}
