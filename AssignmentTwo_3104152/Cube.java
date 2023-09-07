
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
////This line declares a new class called Cube that extends the Square class. 
//This means that Cube inherits all the properties and methods of Square and can also define its own properties and methods.
public class Cube extends Square {
	// A 2 argument constructor that takes a String color and a double length
	// variables.
	public Cube(String color, double length) {
		super(color, length);
	}

	@Override
	// This method calculates the area of the Cube using the formula
	public double area() {
		return 6 * super.area();
	}

	// toString() method of the superclass to include the class name and memory
	// address in the string representation.
	// It then adds the radius, area(), length of the cube to the string
	// representation.
	public String toString() {
		return super.toString() + ", Volume: " + super.area() * getLength();
	}
}
