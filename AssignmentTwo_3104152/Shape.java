
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
// Abstract base class for shapes
public abstract class Shape {

	// private variable for color
	private String color;

	// constructor for Shape that sets color
	public Shape(String color) {
		this.color = color;
	}

	// abstract method to calculate Shape area
	public abstract double area();

	// abstract method to calculate Shape perimeter
	public abstract double perimeter();

	// setter for color
	public String getColor() {
		return color;
	}

// toString() method of the superclass to include the class name and memory
	// address in the string representation.

	public String toString() {
		return "Shape: " + getClass().getSimpleName() + ", Color: " + color;
	}
}