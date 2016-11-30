import java.util.*;


/**
* The class DVDMovie extends class Movie and implements the interface DVD.
*
*@author Kaimbayev
*@version 1.0.0
*/
public class DVDMovie extends Movie implements DVD{

	private int regionCode;
	private String[] audioTracks;
	private String[] subtitles;

	public DVDMovie(String initialTitle, String[] initialActors,
					String initialDirector, int initialRegionCode,
					String[] initialAudioTracks, String[] initialSubtitles)
	{

		super(initialTitle, initialActors, initialDirector);

		this.regionCode = initialRegionCode;
		this.audioTracks = initialAudioTracks;
		this.subtitles = initialSubtitles;

	}

	/**
	 *  Returns the value of the variable regionCode.
	 *
	 * @return  the regionCode.
	 */
	public int getRegionCode(){

		return this.regionCode;

	}

	/**
	 *  Returns a reference to the array audioTracks.
	 *
	 * @return  the audioTracks.
	 */
	public String[] getAudioTracks(){

		return this.audioTracks;

	}

	/**
	 *  Returns a reference to the array subtitles.
	 *
	 * @return  the subtitles.
	 */
	public String[] getSubtitles(){

		return this.subtitles;

	}

	/**
	 *  Returns a string representation of the object with the following format:
	 *  title,format,language.
	 *
	 * @return  the string.
	 */
	public String toString(){

		return getTitle()+","+getRegionCode();

	}
}
