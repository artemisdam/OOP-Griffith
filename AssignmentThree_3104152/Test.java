/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
import java.util.List;// import the List class from the Java util library

// Static class for testing
public class Test {

	// main method
	public static void main(String[] args) {

		// create ShapeManager object
		ShapeManager shapeManager = new ShapeManager();

		// create shape objects using static colours in Shapes class
		Rectangle blue_Rectangle = new Rectangle(Shapes.BLUE, 4, 8); // it creates a blue rectangle with width 4 and height
																	// 5
		Rectangle red_Rectangle = new Rectangle(Shapes.RED, 4, 12); // it creates a red rectangle with width 4 and height 6
		Square red_Square = new Square(Shapes.RED, 7); // it creates a red square with side length 7
		Square blue_Square = new Square(Shapes.BLUE, 5); // it creates a blue square with side length 5
		Square green_Square = new Square(Shapes.GREEN, 3); // it creates a green square with side length 3

		// test adding shapes to shapeManager
		shapeManager.addShape(blue_Rectangle); // it adds blue rectangle to shapeManager
		shapeManager.addShape(blue_Square); // it should print "Error: Colour already taken." 
		shapeManager.addShape(red_Rectangle); // it should print "Rectangle added successfully." 
		shapeManager.addShape(green_Square); // it should print "Square added successfully." 
		shapeManager.addShape(red_Square); // it should print "Error: Colour already taken."

		System.out.println(); // create space between lines

		// test getShapes method and print all shapes
		List<Shape> shapes = shapeManager.getShapes(); // gets a list of all shapes in shapeManager
		System.out.println("All Shapes:");
		for (Shape shape : shapes) { // loops through each shape in shapes and prints them out
			System.out.println(shape);
		}

		System.out.println(); // create space between lines

		// test getSquares method and print their areas
		List<Square> squares = shapeManager.getSquares(); // gets a list of all squares in shapeManager
		System.out.println("Squares:");
		for (Square square : squares) { // loops through each square in squares and prints its area
			System.out.println(square + " area: " + square.area());
		}

		System.out.println(); // create space between lines

		// test getRectangles method and print their perimeters
		List<Rectangle> rectangles = shapeManager.getRectangles(); // gets a list of all rectangles in shapeManager
		System.out.println("Rectangles:");
		for (Rectangle rectangle : rectangles) { // loops through each rectangle in rectangles and prints its perimeter
			System.out.println(rectangle + " perimeter: " + rectangle.perimeter());
		}
		System.out.println(); // create space between lines

		// test getting a square by colour
		Square blueSquare2 = shapeManager.getSquare(Shapes.BLUE); // gets the blue square from shapeManager
		if (blueSquare2 != null) { // if the blue square is found, prints its details
			System.out.println("Blue square found: " + blueSquare2);
		} else { // otherwise prints a message saying it wasn't found
			System.out.println("Blue square not found.");
		}


		// test getting a rectangle by colour
		Rectangle redRectangle2 = shapeManager.getRectangle(Shapes.RED);
		if (redRectangle2 != null) {
			System.out.println("Red rectangle found: " + redRectangle2);
		} else {
			System.out.println("Red rectangle not found.");
		}

		// add a new static colour to the Shapes class which is PURPLE
		Shapes.addColor("PURPLE");

		// change the colour of an existing shape in the shapeList to the new color
		Square purpleSquare = shapeManager.getSquare(Shapes.GREEN);
		if (purpleSquare != null) {
			purpleSquare.setColor(Shapes.PURPLE);
			System.out.println("Green square color changed to purple: " + purpleSquare);
		} else {
			System.out.println("Green square not found.");
		}
	}

}
