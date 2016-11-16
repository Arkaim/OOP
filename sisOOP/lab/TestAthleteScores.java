import  java.io.*;

/**
 * Test driver for class <code>AthleteScores</code>.
 *
 * @author  iKaimbayev
 * @version  1.0.0
 */
public class TestAthleteScores  {

	 /* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	}

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {
	String name = "Usain";
	double scoreOne = "1,1";
	double scoreTwo = "2,1";
	double scoreThree = "3,1";

	AthleteScores jamaica = new AthleteScores (name, scoreOne,
												scoreTwo, scoreThree);

	assertTrue(name.equals(jamaica.getName()));
	assertTrue(scoreOne == jamaica.getScoreOne()));
	assertTrue(scoreTwo == jamaica.getScoreTwo()));
	assertTrue(scoreThree == jamaica.getScoreThree()));

	/**
	*Testing setters
	*/
	jamaica.setName("Aset");
	jamaica.setScoreOne(1.2);
	jamaica.setScoreTwo(2.2);
	jamaica.setScoreThree(3.2);
	assertTrue(name.equals(jamaica.getName()));
	assertTrue(scoreOne == jamaica.getScoreOne()));
	assertTrue(scoreTwo == jamaica.getScoreTwo()));
	assertTrue(scoreThree == jamaica.getScoreThree()));
 
	/**
	*Testing getMinimum()
	*/
	assertTrue(1.2 == getMinimum());
	jamaica.setScoreTwo(0.9);
	assertTrue(0.9 == getMinimum());	
	jamaica.setScoreThree(0.8);
	assertTrue(0.8 == getMinimum());	

	/**
	*Testing toString
	*/
	person = new AthleteScores(name, scoreOne, scoreTwo, scoreThree);

	String result = name + " " + scoreOne + " " + scoreTwo + " " + scoreThree
	                + " ";
	assertTrue("5: testing method toString",
	           result.equals(person.toString()));

	stdOut.println("done");

	/**
	*Testing equals()
	*/
	String name1 = "Bob";

    athlete = new AthleteScores(name, scoreOne, scoreTwo, scoreThree);
    AthleteScores athlete1 = new AthleteScores(name1, scoreOne, scoreTwo, scoreThree);
    assertTrue("Testing equals method: ", athlete.equals(athlete1));

    name1 = "Jam";

    athlete = new AthleteScores(name, scoreOne, scoreTwo, scoreThree);
    athlete1 = new AthleteScores(name1, scoreOne, scoreTwo, scoreThree);
    assertTrue("Testing equals method: ", athlete.equals(athlete1));

    athlete = new AthleteScores(name, scoreOne, scoreTwo, scoreThree);
    athlete1 = new AthleteScores(name1, scoreOne, scoreTwo, scoreThree);
    assertTrue("Testing equals method: ", athlete.equals(athlete1));

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}
}
