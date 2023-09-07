/*Name:Damla Patar 
id:3104152 
date:28/02/2023
*/

public class Test {
	/*
	 * public is access modifier of the main method the main method is run
	 * automatically by the Java Virtual Machine the main() method doesn’t return
	 * anything and return type is void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Film arg1 = new Film(); // empty constructor
		Film arg2 = new Film("Recep Ivedik", 488); // two arguments constructor
		Film arg3 = new Film("Kutsal Damacana", 938, 9.2, 2022);// full constructor

		// Add info for the Film with an empty constructor using setters
		arg1.setTitle("Wanted");
		arg1.setRuntime(369);
		arg1.setRating(9.6);
		arg1.setYearReleased(2023);

		// Print out the informations for all Films using their display methods
		arg1.display_method();
		System.out.println();
		arg2.display_method();
		System.out.println();
		arg3.display_method();

		// Check which Film has the longest runtime and print out its name and year
		// released
		if (arg1.getRuntime() > arg2.getRuntime() && arg1.getRuntime() > arg3.getRuntime()) {
			System.out
					.println(arg1.getTitle() + " released in " + arg1.getYearReleased() + " has the longest runtime.");
		} else if (arg2.getRuntime() > arg1.getRuntime() && arg2.getRuntime() > arg3.getRuntime()) {
			System.out
					.println(arg2.getTitle() + " released in " + arg2.getYearReleased() + " has the longest runtime.");
		} else {
			System.out
					.println(arg3.getTitle() + " released in " + arg3.getYearReleased() + " has the longest runtime.");
		}

	}

}
