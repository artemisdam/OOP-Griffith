//Damla Patar
//Student No:3104152
//Date: 13.04.2023

import java.util.ArrayList;

//This class named "Values" with a generic type parameter "T" and represents a collection of values of type "T".
public class Values<T> {

	// ArrayList with the generic type parameter "T" and its ArrayList will store
	// the values of type "T".

	private ArrayList<T> data;

	// This constructor for the Values class initialises the data ArrayList.
	public Values() {

		data = new ArrayList<T>();
	}

	// "add" method adds an element of type "T" to the data ArrayList.
	public void add(T element) {

		data.add(element);
	}

	// "remove" method removes an element of type "T" from the data ArrayList.

	public void remove(T element) {

		data.remove(element);
	}

	// "get" remove returns the element of type "T" at the specified index in the
	// data ArrayList.
	public T get(int index) {

		return data.get(index);
	}

	// "set" method replaces the element of type "T" at the specified index in the data ArrayList with the new element.
	public void set(int index, T element) {

		data.set(index, element);
	}
}
