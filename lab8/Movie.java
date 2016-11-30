import java.util.*;


/**
* Class Movie
*
*@author Kaimbayev
*@version 1.0.0
*/
public abstract class Movie{
	private String title;
	private String[] actors;
	private String director;

	public  Movie(String initialTitle,String[] initialActors, String initialDirector){
		this.title = initialTitle;
		this.actors = initialActors;
		this.director = initialDirector;
	}

	/**
	* method to get title
	*/
	public String getTitle(){

		return this.title;

	}

	/**
	* method to get actors
	*/
	public String[] getActors(){

		return this.actors;

	}

	/**
	* method to get director
	*/
	public String getDirector(){

		return this.director;

	}

	/**
	* method to get string
	*/
	public String toString(){

		return this.title;

	}
}
