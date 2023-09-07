//Damla Patar
//Student No:3104152
//Date: 13.04.2023

/*To make immutable class in Java you need to follow the below steps.

-In order not to extend the class, it must be marked with the final key.
-Make all fields of the class private so that no direct access is allowed.
-Do not provide setter methods for variables.
-Make all mutable fields final so they can only be assigned once.
-Have all fields initialise their values ​​via the constructor.
-Perform cloning of objects outside of all variable fields. */

// File class will represent a file and will have a singleton design pattern.

public class File {

	// private static instance of the File class.
	// it will be shared among all the objects that are created from this
	// class.

	private static File instance = null;

	// two instance variables of type String named "name" and "extension".

	private String name;
	private String extension;

	// a private constructor for the File class.
	// it is private so that it cannot be accessed from outside
	// the class and it is a Singleton design pattern
	private File() {

	}

	// public static method called "getInstance".
	// This method returns the instance of the File class.
	public static File getInstance() {

		if (instance == null) {// If the instance is null, a new instance of the File class is created.
			instance = new File();

		}
		return instance;
	}

}
