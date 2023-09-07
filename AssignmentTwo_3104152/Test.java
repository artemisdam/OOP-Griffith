
/*Name:Damla Patar 
id:3104152 
date:15/03/2023
*/
import java.util.ArrayList; // import array library

// Static class for testing
public class Test {

	// main method
	public static void main(String[] args) {

		// ArrayList of shapes
		// Store all the instances in the ArrayList shapes.
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		// create a Square object
		Square blueSquare = new Square("blue", 12);
		// create a circle object
		Circle redcircle = new Circle("red", 3);
		// create a cube object
		Cube pinkcube = new Cube("pink", 4);
		// create a triangle object
		Triangle blacktriangle = new Triangle("black", 5, 6, 7);
		// create a rectangle object
		Rectangle greyrectangle = new Rectangle("grey", 4, 8);
		// add all shapes to the list
		shapes.add(blueSquare);
		shapes.add(redcircle);
		shapes.add(pinkcube);
		shapes.add(blacktriangle);
		shapes.add(greyrectangle);

		// This loop iterates over all the Shape objects in the shapes array and prints
		// their string representation using the toString() method.
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}

		// Print area of all blue shapes
		// This loop iterates over all the Shape objects in the shapes array and adds
		// the area of all the blue Shape objects to the totalBlueArea variable.

		double tot_BlueArea = 0;
		for (Shape shape : shapes) {
			if (shape.getColor().equals("blue")) {
				tot_BlueArea += shape.area();
			}
		}
		// it prints the total area of all the blue shapes.
		System.out.println("Total area of blue shapes: " + tot_BlueArea);

		// Print perimeter of all red shapes
		double tot_Red_perimeter = 0;
		for (Shape shape : shapes) { // all shapes will be in for loop to find the red color ones
			if (shape.getColor().equals("red")) { // if yes then total red perimeter will be updated.
				tot_Red_perimeter += shape.perimeter();
			}
		}
		System.out.println("Total perimeter of red shapes: " + tot_Red_perimeter);

		// Find shape with largest area and largest perimeter
		// This loop iterates over all the Shape objects in the shapes array and checks
		// which shape has the largest area and which shape has the largest perimeter.
		// It does this by comparing the area and perimeter of each Shape object with
		// the current maximum area and perimeter,

		Shape maxAreaShape = null;
		Shape maxPerimeterShape = null;
		double maxArea = 0;
		double maxPerimeter = 0;
		for (Shape shape : shapes) {

			if (shape.area() > maxArea) { // check area of shapes
				maxArea = shape.area(); // update maximum area
				maxAreaShape = shape;// update maxArea
			}
			if (shape.perimeter() > maxPerimeter) { // check perimeter of shapes
				maxPerimeter = shape.perimeter(); // update maximum perimeter
				maxPerimeterShape = shape; // update maxPerimeter
			}
		}
		// it prints the maxAreaShape and maxPerimeterShape objects with their
		// string representation using the toString() method.
		System.out.println("Shape With Largest Area: " + maxAreaShape.toString());
		System.out.println("Shape With Largest Perimeter: " + maxPerimeterShape.toString());
	}

}
