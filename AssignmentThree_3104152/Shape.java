/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
// Abstract base class for shapes
public abstract class Shape {

	// private variable for color
	private String color;

	// constructor for Shape that sets Color
	public Shape(String color) {
		this.color = color;
	}

	// abstract method to calculate Shape area
	public abstract double area();

	// abstract method to calculate Shape perimeter
	public abstract double perimeter();

	// getter for color
	public String getColor() {
		return color;
	}

	// setter for color
	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Color: " + this.color;
	}
}
