import  java.io.*;
import  java.util.*;
import java.io.BufferedReader;
import java.io.IOException;

class sis {

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
    	final String DELIM = ",";
    	System.out.println("Enter input with (,)");
    	StringTokenizer tknzr = new StringTokenizer (stdIn.readLine() , DELIM);  
		int counter = tknzr.countTokens();
       System.out.println(counter);
       while (tknzr.hasMoreTokens()) {
   			System.out.println("token : " + tknzr.nextToken());    
   		}

    }
}

