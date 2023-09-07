/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
import java.util.ArrayList;

public interface Shapes {
	// Defines static final attributes for colors
	// static final attributes colors
	String RED = "Red";
	String BLUE = "Blue";
	String GREEN = "Green";
	String PURPLE = null;

	public ArrayList<Shape> getShapes();
	// gets all shapes from the shape list

	public ArrayList<Square> getSquares();
	// get all Square shapes from an shapelist
	// you can use instanceof to check type

	public ArrayList<Rectangle> getRectangles();
	// get all Rectangle shapes from the shape list
	// you can use instanceof to check type

	public Square getSquare(String color);
	// return the square with the given color.

	public Rectangle getRectangle(String color);
	// return the rectangle with the given color.

	public void addShape(Square square);
	// add the given square to the shapeList
	// don't add more than one color per shape, i.e. if there's already a blue
	// Square don't add another one
	// print out if added successfully or print an error if the color is already
	// taken

	public void addShape(Rectangle rectangle);
	// add the given rectangle to the shapeList
	// don't add more than one color per shape, i.e. if there's already a blue
	// Rectangle don't add another one
	// print out if added successfully or print an error if the color is already
	// taken

	public void addShape(String color, double length, double width);
	// if length and width are the same create a Square and add it to shapes
	// else if length and width are different sizes create a Rectangle and add it to
	// shapes
	// don't add more than one color per shape, i.e. if there's already a blue
	// Square don't add another one
	// print out if added successfully or print an error if the color is already
	// taken

	// Defines a default method to return the color list
	default String[] colorList() {
		return new String[] { RED, GREEN, BLUE };
	}

	// Defines a static method to add a new color to the color list
	public static void addColor(String string) {
		// TODO Auto-generated method stub

	}

}
