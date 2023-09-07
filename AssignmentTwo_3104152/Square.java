
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
//Class for creating Square objects, inherits form Shape
public class Square extends Shape {

	// private attribute length
	private double length;

	// Constructor that sets length and color
	public Square(String color, double length) {
		super(color);
		this.length = length;
	}

	// Overridden area method that returns the area of the Square
	@Override
	public double area() {
		return length * length;

	}

	// Overridden perimeter method that returns the perimeter of the Square
	@Override
	public double perimeter() {
		return length * 4;
	}

	// getter for length
	public double getLength() {
		return length;
	}

}
