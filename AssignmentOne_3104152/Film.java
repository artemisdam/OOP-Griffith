
/*Name:Damla Patar 
id:3104152 
date:28/02/2023
*/
// Designing and implementing a class called Film that has the following attributes
public class Film {
	// The private keyword is an access modifier used for attributes, methods and
	// constructors, making them only accessible within the declared class.
	private String title;
	private int runtime;
	private double rating;
	private int yearReleased;

	// A constructor in Java is a special method that is used to initialise objects.
	// The constructor is called when an object of a class is created. It can be
	// used to set initial values for object attributes, the constructor name must
	// match the class name.
	public Film() { // An empty constructor, that sets all attributes to defaults
		// The this keyword refers to the current object in a method or constructor.
		// The most common use of the this keyword is to eliminate the confusion between
		// class attributes and parameters with the same name
		this.title = "Untitled";
		this.runtime = 0;
		this.rating = 0.0;
		this.yearReleased = 0;
	}

//A 2 argument constructor that takes a title and runtime , and sets the other attributes to defaults
	public Film(String title, int runtime) {
		this.title = title;
		this.runtime = runtime;
		this.rating = 0.0;
		this.yearReleased = 0;
	}

//a full constructor that takes and sets all arguments,
	public Film(String title, int runtime, double rating, int yearReleased) {
		this.title = title;
		this.runtime = runtime;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}

//	A method display that prints a string with all the Films informations
	public void display_method() {
		System.out.println("Title: " + title);
		System.out.println("Runtime: " + runtime + " minutes");
		System.out.println("Rating: " + rating);
		System.out.println("Year Released: " + yearReleased);
	}
//Make all attributes private and add getters and setters for each attribute.
	// The methods that allow data encapsulation to be provided by using private
	// variables defined in another class in Java are called Setter and Getter.

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
}
