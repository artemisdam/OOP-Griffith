//Damla Patar
//Student No:3104152
//Date: 13.04.2023

// it is declared final to prevent it from being sub-classed.
public final class Film {

	// two final instance variables "title" and "year" private final keyword makes
	// variables cannot be changed after they are initialised.
	private final String title;
	private final int year;

	// a constructor for the Film class which takes in a String "title" and an int
	// "year".

	public Film(String title, int year) {

		// this keyword setting the values of the instance variables "title" and "year".

		this.title = title;
		this.year = year;

	}

	// This method returns a String (the value of "title").
	public String getTitle() {

		return title;
	}

	// This method returns an int (the value of "year").
	public int getYear() {

		return year;
	}
}
