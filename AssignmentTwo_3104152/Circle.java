
/*Name:Damla Patar 
id:3104152 
date:1/03/2023
*/
//This line declares a new class called Circle that extends the Shape class. 
//This means that Circle inherits all the properties and methods of Shape and can also define its own properties and methods.
public class Circle extends Shape {
	// The private keyword is an access modifier used for attributes, methods and
	// constructors, making them only accessible within the declared class.
	private double radius;

	// A 2 argument constructor that takes a String color and a double radius
	// variables.
	public Circle(String color, double radius) {
		// Whenever a subclass wants to access its superclass, it can use the super
		// keyword.
		// There are two ways to use super. The first is for creating superclass
		// objects.
		// The second is for accessing the elements of the superclass.
		super(color);
		// The most common use of the this keyword is to eliminate the confusion between
		// class attributes and parameters with the same name
		this.radius = radius;
	}

//This method is a getter method that returns the value of the radius variable. 
	public double getRadius() {
		return radius;
	}

	@Override
	// This method calculates the area of the circle using the formula
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	// This method calculates the perimeter of the circle using the formula
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

//toString() method of the superclass to include the class name and memory address in the string representation. 
	// It then adds the radius, area(), and perimeter() of the circle to the string
	// representation.
	public String toString() {
		return super.toString() + ", Radius: " + radius + ", Area: " + area() + ", Perimeter: " + perimeter();
	}
}
