
//DamlaPatar-3104152-27/04/2023
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

//Write a class called Test that creates an ArrayList of 5 customers. 
//Sort the list, using the Collections.sort method. 
public class Test {
	public static void main(String[] args) {
		// Create an ArrayList of 5 customers
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(27, "Damla Patar", "537-76-12-22"));
		customers.add(new Customer(30, "Dogan Patar", "999-66-33-96"));
		customers.add(new Customer(63, "Kenan Patar", "693-28-282-21"));
		customers.add(new Customer(39, "Melek Ozturk", "599-12-98-76"));
		customers.add(new Customer(52, "Fatma Ozturk", "512-845-98-23"));

		// Sort the list using the Collections.sort method
		Collections.sort(customers);
//Loop through the sorted list and print the details of each customer as a new line in a text file. 
		// The example below will open/create a text file called Customers.txt and print
		// the line “Test”.
		// You will need to wrap this code in a try/catch/finally block.
		// Print the sorted list
		for (Customer customer : customers) {
			System.out.println(customer);
		}

		System.out.println();
		// Write the sorted list to a text file
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("Customers.txt"));
			for (Customer customer : customers) {
				out.println(customer);
			}
			System.out.println("Successfully wrote the customer details to Customers.txt");
		} catch (Exception e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
