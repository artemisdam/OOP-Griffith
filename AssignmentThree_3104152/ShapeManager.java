/*Name:Damla Patar 
id:3104152 
date:03/04/2023
*/
import java.util.ArrayList; //import java library ArrayList

//implement the Shapes interface to ShaperManager class
public class ShapeManager implements Shapes {
	// create an ArrayList to hold the list of shapes
	ArrayList<Shape> shapeList;

	// constructor to initialise the ArrayList
	public ShapeManager() {
		shapeList = new ArrayList<Shape>();
	}

	// this method to get all the shapes in the list which is shapeList that is created at the constructor
	@Override
	public ArrayList<Shape> getShapes() {
		return shapeList;
	}

	// this method to get all the squares in the list
	@Override
	public ArrayList<Square> getSquares() {
		//create squareList object
		ArrayList<Square> squareList = new ArrayList<Square>();
		//each shape will be returned in the for loop
		for (Shape shape : shapeList) {
			//check shape is in the Square
			if (shape instanceof Square) {
				//then add the list
				squareList.add((Square) shape);
			}
		}
		return squareList;
	}

	// this method to get all the rectangles in the list
	@Override	
	public ArrayList<Rectangle> getRectangles() {
		//create rectangle list object
		ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
		//each shape will be returned in the for loop
		for (Shape shape : shapeList) {
			//check shape is in the rectangle
			if (shape instanceof Rectangle) {
				//then add the list
				rectangleList.add((Rectangle) shape);
			}
		}
		return rectangleList;
	}

	// this method to get a specific square with a given colour
	@Override
	public Square getSquare(String color) {
		//each shape will be returned in the for loop
		for (Shape shape : shapeList) {
			//check the shape is instance of Square and get colour which is equals to colour
			if (shape instanceof Square && shape.getColor().equals(color)) {
				//then return the Square shape
				return (Square) shape;
			}
		}
		// else turn null.
		return null;
	}

	// method to get a specific rectangle with a given colour
	@Override
	public Rectangle getRectangle(String color) {
		//each shape will be returned in the for loop
		for (Shape shape : shapeList) {
			//check the shape is instance of rectangle and get colour which is equals to colour
			if (shape instanceof Rectangle && shape.getColor().equals(color)) {
				//then return the rectangle shape
				return (Rectangle) shape;
			}
		}
		return null;
	}

	// this method to add a square to the list
	@Override
	public void addShape(Square square) {
		if (!colorExists(square.getColor())) {
			shapeList.add(square);
			System.out.println("Square added successfully.");
		} else {
			System.out.println("Error: Color already taken.");
		}
	}

	// this method to add a rectangle to the list
	@Override
	public void addShape(Rectangle rectangle) {
		if (!colorExists(rectangle.getColor())) {
			shapeList.add(rectangle);
			System.out.println("Rectangle added successfully.");
		} else {
			System.out.println("Error: Color already taken.");
		}
	}

	// this method to add a square or a rectangle with a given colour, length, and width
	// to the list
	@Override
	public void addShape(String color, double length, double width) {
		if (!colorExists(color)) {
			if (length == width) {
				Square square = new Square(color, length);
				shapeList.add(square);
				System.out.println("Square added successfully.");
			} else {
				Rectangle rectangle = new Rectangle(color, length, width);
				shapeList.add(rectangle);
				System.out.println("Rectangle added successfully.");
			}
		} else {
			System.out.println("Error: Color already taken.");
		}
	}

	// this helper method to check if a shape with a given colour already exists in the
	// list
	private boolean colorExists(String color) {
		//each shape will be returned in the for loop
		for (Shape shape : shapeList) {
			if (shape.getColor().equals(color)) {
				return true;
			}
		}
		return false;

	}

}
