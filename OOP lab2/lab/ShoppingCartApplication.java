import  java.io.*;
import  java.util.*;


/**
	 * This class is written for the purpose of managing information of products
	 * 
	 * @author Islam Kaimbayev
	 * @version 1.0.0
	 */

public class ShoppingCartApplication  {

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	private ShoppingCart cart;

	/**
	 * Constructor creates new object of ShoppingCartApplication class
	 *
	 * @param args  not used
	 * @throws IOException  if error occurs when reading from the keyboard.
	 * @throws NumberFormatException  if input string does not contain a 
	 *         parsable double.
	 */
	public static void main(String[]  args) throws IOException  {

		ShoppingCartApplication application = new  ShoppingCartApplication();

		application.run();
	}

	private void run() throws IOException  {

		cart = new  ShoppingCart();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				cart.addProduct(readProduct());
			} else if (choice == 2)  {
				stdOut.println(cart.toString());
			} else if (choice == 3)  {
				stdOut.println(cart.getTotalValue());
			}

			choice = getChoice();
		}
	}

	private int  getChoice() throws IOException  {

		do  {

			int input;

			try  {
				stdErr.println();
				stdErr.print("[0]  Quit\n"
				             + "[1]  Add Product\n"
				             + "[2]  Display Products\n"
				             + "[3]  Display Total\n"
				             + "choice>");
				stdErr.flush();

				input = Integer.parseInt(stdIn.readLine());

				if (0 <= input && 3 >= input)  {

					return  input;

				} else {
					stdErr.println("Invalid choice:  " + input);
				}
			} 
				catch (NumberFormatException  nfe)  {
				stdErr.println(nfe);
			}
		}  
		
			while (true);
	}

	private Product readProduct() throws IOException {

		final String DELIM = "_";

		String name = "";
		int quantity = 0;
		double price = 0.0;

		do{  
 
            try{   
                stdOut.print("Enter product [name_quantity_price]>");   
                stdOut.flush();   
                StringTokenizer q = new StringTokenizer(stdIn.readLine() , DELIM); 
  
                if(q.countTokens()!= 3) {   
                    stdErr.println("Invalid input type");   
                }

		else{   
                    name = q.nextToken();   
                    quantity = Integer.parseInt(q.nextToken());   
                    price = Double.parseDouble(q.nextToken());   
                    if (quantity <= 0) {   
                        stdErr.println("Invalid input enter with _");   
                    } else if (price < 0) {   
                        stdErr.println("Invalid input enter with _");   
                    }
		else{   
                        break;   
                    }   
                }   
            }
		catch(NumberFormatException nfe){   
                	stdErr.println(nfe.toString());   
		}
        }
		while(true);   
        
		return new Product(name, quantity, price);
	}
}
