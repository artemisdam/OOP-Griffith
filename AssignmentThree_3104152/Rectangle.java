/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
public class Rectangle extends Square { // Rectangle class extends Square class

	private double width; // private variable width

	public Rectangle(String color, double length, double width) { // constructor that takes color, length, and width
		super(color, length); // call the constructor of the superclass (Square) with color and length
		this.width = width; // set the value of width
	}

	@Override
	public double area() { // override the area method of the superclass
		return width * getLength(); // calculate and return the area of the rectangle
	}

	@Override
	public double perimeter() { // override the perimeter method of the superclass
		return (width + getLength()) * 2; // calculate and return the perimeter of the rectangle
	}

	public String toString() { // override the toString method
		return super.toString() + ", Width : " + this.width; // return a string representation of the rectangle
	}
}
