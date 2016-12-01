import java.util.*;
import java.io.*;

 * @author  Kaimbayev
 * @version  1.0.0
 * @see  Employee
 */
public class  EmployeeFileIO {

	/**
	 * Creates an <code>ArrayList</code> of <code>Employee</code> objects
	 * from a file that contains employee data.
	 * <p>
	 * Every line in the specified file should contain three fields: ID, name,
	 * and salary of an employee in the following format: ID_name_salary
	 * </p>
	 *
	 * @param filename  the name of a file containing employee data.
	 * @return  an <code>ArrayList</code> of <code>Employee</code> objects.
	 * @throws FileNotFoundException  if the specified file does not exist.
	 * @throws IOException  if an I/O error occurs.
	 * @throws NoSuchElementException  if the data in the file is incomplete.
	 * @throws NumberFormatException  if the file contains invalid numbers.
	 */
	public static ArrayList<Employee> read(String filename)
		throws FileNotFoundException,
			IOException,
			NoSuchElementException,
			NumberFormatException  {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		BufferedReader fileIn = new BufferedReader(new FileReader(filename));
		String line = fileIn.readLine();

		while(line != null){

			Employee employee;

			StringTokenizer tknzr = new StringTokenizer(line, "_");
			int i = 0;
			int id = 0;
			String name = "";
			double salary = 0.0;


			while(tknzr.hasMoreTokens()) {

				String currentLine = tknzr.nextToken();

				if(i == 0)
					id = Integer.parseInt(currentLine);
				else if (i == 1)
					name = currentLine;
				else
					salary = Double.parseDouble(currentLine);

				i++;
			}

			employee = new Employee(id, name, salary);
			arrayList.add(employee);
			line = fileIn.readLine();
		}
		fileIn.close();
		return arrayList;
	}

	/**
	 * Creates a file of employee data from an <code>ArrayList</code> of
	 * <code>Employee</code> objects.
	 * <p>
	 * Every line in the file should contain the ID, name, and salary of an
	 * employee separated by an underscore: ID_name_salary
	 * </p>
	 *
	 * @param filename  the name of the file that will store the employee data.
	 * @param arrayList  an <code>ArrayList</code> of <code>Employee</code>
	 *                   objects.
	 * @throws IOException  if an I/O error occurs.
	 */
	public static void write(String filename, ArrayList<Employee> arrayList)
		throws IOException  {

		PrintWriter out = new PrintWriter(new FileWriter(filename));

		for(Employee employee: arrayList){
			String currentLine = employee.getId() + "_" + employee.getName() + "_"
			 							+ employee.getSalary();
			out.println(currentLine);
		}
		out.close();

	}
}
