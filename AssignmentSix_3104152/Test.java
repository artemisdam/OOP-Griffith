/* Name: Damla Patar
   ID: 3104152
   Date: 13/05/2023 */

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// Create a new Bookshop
		Bookshop book_shop = new Bookshop("Bookstore", "123 Main St");

		// Add new books to the Bookshop
		book_shop.addBook("Damla", 33.00);
		book_shop.addBook("Buyology", 15.84);
		book_shop.addBook("Ataturk", 92.91);
		book_shop.addBook("Dogan", 58.00);

		

		// Add used books to the Bookshop
		book_shop.addBook("1994", 12.11, false);
		book_shop.addBook("Brave New World", 10.69, true);
		book_shop.addBook("Ela Ela", 18.11, false);
		book_shop.addBook("Kılıcdaroglu", 18.69, false);

		// Create a new Customer named Kenan with a wallet balance of 50.00
		Customer customer = new Customer("Kenan", 80.00);

		// Get the list of books available for sale in the Bookshop
		ArrayList<Book> books_ForSale = book_shop.getBooksForSale();

		// Display the books for sale in the Bookshop
		System.out.println("For sale books in the Bookshop:");
		System.out.print("---------------------------------------------");

		for (Book book : books_ForSale) {
			System.out.println();
			String usedStatus = book.isUsed() ? " (used before)" : "";
			System.out.printf("%s - $%.2f%s%n", book.getTitle(), book.getPrice(), usedStatus);
		}
	
		System.out.println("---------------------------------------------");

		// Have the Customer buy a new book from the Bookshop
		try {
			String bookTitle = "Damla";
			double bookPrice = book_shop.getBook(bookTitle).getPrice();

			customer.buyBookFromBookshop(bookTitle, book_shop);

			System.out.println(customer.getName() + " has purchased " + bookTitle + " for $" + bookPrice + ".");
			System.out.println(customer.getName() + " has $" + customer.getWallet() + " remaining in their wallet.");
			System.out.println();
		} catch (InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println();
		}

		// Have the Customer buy a used book from the Bookshop
		try {
			customer.buyBookFromBookshop("1994", book_shop);
			System.out.println(
					customer.getName() + " has purchased 1984 for $" + customer.getBooks().get(1).getPrice() + ".");
			System.out.println(customer.getName() + " has $" + customer.getWallet() + " remaining in their wallet.");
			System.out.println();
		} catch (InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println();
		}

		// Have the Customer sell a book to the Bookshop
		Book book_ToSell = customer.getBooks().get(0);
		double price = book_shop.buyBookFromCustomer(book_ToSell);

		if (price > 0) {
			customer.removeBook(book_ToSell.getTitle());
			customer.addToWallet(price);
			String message = String.format("%s has sold %s to the Bookshop for $%.2f.", customer.getName(),
					book_ToSell.getTitle(), price);
			System.out.println(message);

			double wallet_Balance = customer.getWallet();
			System.out.println(customer.getName() + " has $" + wallet_Balance + " in their wallet.");
			System.out.println();
		} else {
			System.out.println("The Bookshop did not accept the book.");
			System.out.println();
		}

	}
}
