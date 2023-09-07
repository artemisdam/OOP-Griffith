/* Name: Damla Patar
   ID: 3104152
   Date: 13/05/2023 */

public class Book {
    private String title; // Stores the title of the book
    private double price; // Stores the price of the book
    private boolean used; // Indicates whether the book is used or not

    // Constructor to create a new book with a given title and price
    public Book(String title, double price) {
        this.title = title; // Set the title of the book
        this.price = price; // Set the price of the book
        this.used = false; // By default, the book is considered new
    }

    // Constructor to create a new book with a given title, price, and used status
    public Book(String title, double price, boolean used) {
        this.title = title; // Set the title of the book
        this.price = price; // Set the price of the book
        this.used = used; // Set the used status of the book
    }

    // Method to get the title of the book
    public String getTitle() {
        return this.title; // Return the title of the book
    }

    // Method to get the price of the book
    public double getPrice() {
        return this.price; // Return the price of the book
    }

    // Method to check if the book is used or not
    public boolean isUsed() {
        return this.used; // Return the used status of the book
    }

    // Method to set the used status of the book
    public void setUsed(boolean used) {
        this.used = used; // Set the used status of the book
    }
}
