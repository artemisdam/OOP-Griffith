/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
public class Square extends Shape {

	// private variable for the length of the square
	private double length;

	// constructor for Square that sets color and length
	public Square(String color, double length) {
		super(color);
		this.length = length;
	}

	// overridden method to calculate the area of the square
	@Override
	public double area() {
		return length * length;
	}

	// overridden method to calculate the perimeter of the square
	@Override
	public double perimeter() {
		return length * 4;
	}

	// getter for the length of the square
	public double getLength() {
		return length;
	}

	// setter for the length of the square
	public void setLength(double length) {
		this.length = length;
	}

	// overridden toString method to print the color and length of the square
	public String toString() {
		return super.toString() + ", Length : " + this.length;
	}
}
