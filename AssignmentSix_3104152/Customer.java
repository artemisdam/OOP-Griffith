/* Name: Damla Patar
   ID: 3104152
   Date: 13/05/2023 */

import java.util.ArrayList;

public class Customer {
	private String name;
	private double wallet;
	private ArrayList<Book> books;
	//constructor of the Customer class. It takes two parameters: name and wallet. 
	//When a new Customer object is created, this constructor is called to initialise the object's state. 
	//It assigns the provided name and wallet values to the respective member variables. 
	//It also initialises the books variable as a new ArrayList object to store the customer's books.
	public Customer(String name, double wallet) {
		this.name = name;
		this.wallet = wallet;
		this.books = new ArrayList<Book>();
	}

	public String getName() {
		return this.name;
	}

	public double getWallet() {
		return this.wallet;
	}

	public double addToWallet(double amount) {
		this.wallet += amount; // Add the specified amount to the wallet balance
		return this.wallet; // Return the updated wallet balance
	}

	public double takeFromWallet(double amount) {
		if (this.wallet < amount) {
			throw new IllegalArgumentException("Insufficient funds"); // Throw an exception if the wallet balance is
																		// less than the requested amount
		}
		this.wallet -= amount; // Subtract the specified amount from the wallet balance
		return this.wallet; // Return the updated wallet balance
	}

	public void addBook(Book book) {
		this.books.add(book); // Add the provided book to the list of books owned by the customer
	}

	public void removeBook(String title) {
		for (Book book : this.books) {
			if (book.getTitle().equals(title)) {
				this.books.remove(book); // Remove the book from the list of books based on the provided title
				break; // Stop the loop after removing the book
			}
		}
	}

	public void removeFromBooks(Book book) {
		this.books.remove(book); // Remove the specified book from the list of books owned by the customer
	}

	public ArrayList<Book> getBooks() {
		return this.books; // Return the list of books owned by the customer
	}

	public Book getBook(String title) {
		for (Book book : this.books) {
			if (book.getTitle().equals(title)) {
				return book; // Return the book from the list based on the provided title
			}
		}
		return null; // Return null if the book is not found
	}

	public void buyBookFromBookshop(String title, Bookshop bookshop) throws InsufficientFundsException {
		Book book = bookshop.getBook(title); // Retrieve the book from the bookshop based on the provided title
		if (book == null) {
			throw new IllegalArgumentException("Book not found in the bookshop."); // Throw an exception if the book is
																					// not found in the bookshop
		}
		if (book.isUsed()) {
			throw new IllegalArgumentException("Cannot buy used books from the bookshop."); // Throw an exception if the
																							// book is marked as used
		}
		double price = book.getPrice(); // Get the price of the book
		if (this.wallet < price) {
			throw new InsufficientFundsException("Insufficient funds to buy the book."); // Throw an exception if the
																							// customer has insufficient
																							// funds to buy the book
		}
		this.wallet -= price; // Subtract the price of the book from the wallet balance
		this.books.add(book); // Add the book to the list of books owned by the customer
		bookshop.removeBook(title); // Remove the book from the bookshop's inventory
	}
}
