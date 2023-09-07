
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
//Class for creating Triangle objects, inherits form Shape
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	// A 3 argument constructor that takes a String color and a double side1, a
	// double side2 and a double side3 variables.
	public Triangle(String color, double side1, double side2, double side3) {
		super(color);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	@Override
	// Overridden area method that returns the area of the triangle
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	// Overridden perimeter method that returns the perimeter of the triangle
	public double perimeter() {
		return side1 + side2 + side3;
	}

	// toString() method of the superclass to include the class name and memory
	// address in the string representation.
	// It then adds the side1, side2, side3 and area, perimeter of the triangle to
	// the string representation.
	public String toString() {
		return super.toString() + ", Side 1: " + side1 + ", Side 2: " + side2 + ", Side 3: " + side3 + ", Area: "
				+ area() + ", Perimeter: " + perimeter();
	}
}
