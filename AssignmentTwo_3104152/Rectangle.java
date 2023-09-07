
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
//This line declares a new class called Rectangle that extends the Shape class. 
//This means that Rectangle inherits all the properties and methods of Shape and can also define its own properties and methods.
public class Rectangle extends Shape {
	private double width;
	private double height;

	// A 3 argument constructor that takes a String color and a double width, a
	// double height
	// variables.
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	// This method calculates the area of the rectangle using the formula
	public double area() {
		return width * height;
	}

	@Override
	// This method calculates the perimeter of the rectangle using the formula
	public double perimeter() {
		return 2 * (width + height);
	}

	// toString() method of the superclass to include the class name and memory
	// address in the string representation.
	// It then adds the width, height, perimeter and area of the rectangle to the
	// string
	// representation.
	public String toString() {
		return super.toString() + ", Width: " + width + ", Height: " + height + ", Area: " + area() + ", Perimeter: "
				+ perimeter();
	}
}
