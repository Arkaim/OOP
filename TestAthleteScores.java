import  java.io.*;

/**
 * Test driver for class <code>AthleteScores</code>.
 *
 * @author  author name
 * @version  1.0.0
 */
public class TestAthleteScores  {

	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {


		/* PLACE YOUR CODE HERE */
	}

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
