import java.util.*;
/**
 *  Class AudioFile
 *
 * @author  Kaimbayev
 * @version  1.0.0
 */
public class AudioFile implements MediaFile{

	private String name;
	private int duration;
	private String MEDIA_TYPE = "AUDIO";

	public AudioFile(String initialName, int initialDuration ){

		this.name = initialName;
		this.duration = initialDuration;

	}

	/**
	 * method to get Name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * method to get duration
	 */
	public int getDuration(){
		return this.duration;
	}

	/**
	 * method to get mediatype
	 */
	public String getMediaType(){
		return (MEDIA_TYPE);
	}

	/**
	 * method to define equals objects
	 */
	public boolean equals(Object object){
		return object instanceof AudioFile &&
		((AudioFile) object).getName().equals(getName());

	}

	/**
	 * method returns string of names and duration
	 */
	public String toString(){
		return getName() + "," + getDuration();
	}
}
