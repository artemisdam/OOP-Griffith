/* Name: Damla Patar
   ID: 3104152
   Date: 13/05/2023 */

import java.util.ArrayList;

public class Bookshop {
    private String shopName; // Stores the name of the bookshop
    private String address; // Stores the address of the bookshop
    private ArrayList<Book> inventory; // Stores the inventory of books in the bookshop

    // Constructor to create a new Bookshop with a given shop name and address
    public Bookshop(String shopName, String address) {
        this.shopName = shopName; // Set the name of the bookshop
        this.address = address; // Set the address of the bookshop
        this.inventory = new ArrayList<Book>(); // Initialize an empty inventory of books
    }

    // Method to get the name of the bookshop
    public String getShopName() {
        return this.shopName; // Return the name of the bookshop
    }

    // Method to set the name of the bookshop
    public void setShopName(String shopName) {
        this.shopName = shopName; // Set the name of the bookshop
    }

    // Method to get the address of the bookshop
    public String getAddress() {
        return this.address; // Return the address of the bookshop
    }

    // Method to set the address of the bookshop
    public void setAddress(String address) {
        this.address = address; // Set the address of the bookshop
    }

    // Method to add a new book to the bookshop's inventory with a given title and price
    public void addBook(String title, double price) {
        Book book = new Book(title, price); // Create a new Book object
        this.inventory.add(book); // Add the book to the inventory
    }

    // Method to add a new book to the bookshop's inventory with a given title, price, and used status
    public void addBook(String title, double price, boolean used) {
        Book book = new Book(title, price, used); // Create a new Book object
        this.inventory.add(book); // Add the book to the inventory
    }

    // Method to get the list of books available for sale (excluding used books) in the bookshop
    public ArrayList<Book> getBooksForSale() {
        ArrayList<Book> booksForSale = new ArrayList<Book>(); // Create a new ArrayList to store books for sale
        for (Book book : this.inventory) {
            if (!book.isUsed()) {
                booksForSale.add(book); // Add the book to the list of books for sale if it is not used
            }
        }
        return booksForSale; // Return the list of books for sale
    }

    // Method to get a specific book from the bookshop's inventory based on its title
    public Book getBook(String title) {
        for (Book book : this.inventory) {
            if (book.getTitle().equals(title)) {
                return book; // Return the book if its title matches the specified title
            }
        }
        return null; // Return null if the book is not found in the inventory
    }

    // Method to remove a specific book from the bookshop's inventory based on its title
    public void removeBook(String title) {
        for (Book book : this.inventory) {
            if (book.getTitle().equals(title)) {
                this.inventory.remove(book); // Remove the book from the inventory if its title matches the specified title
                break;
            }
        }
    }
    // Method to buy a book from a customer and add it to the bookshop's inventory
    public double buyBookFromCustomer(Book book) {
        if (book.isUsed()) {
            throw new IllegalArgumentException("Cannot buy used books from customers."); // Throw an exception if the book is used
        }
        this.inventory.add(book); // Add the book to the bookshop's inventory
        double price = book.getPrice(); // Get the price of the book
        return price; // Return the price of the book
    }
}

    // Method to buy a book from a customer and
