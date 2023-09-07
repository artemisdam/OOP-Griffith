//DamlaPatar-3104152-27/04/2023
//Write a class called Customer that has attributes ID, age, name and phoneNumber.
public class Customer implements Comparable<Customer> {
	// declaring a static variable that will be used to assign IDs to customers
	private static int nextID = 1;
	// declare instance variables
	private int ID;
	private int age;
	private String name;
	private String phoneNumber;

	// constructor that takes age, name, and phone number as parameters
	public Customer(int age, String name, String phoneNumber) {
		// assigning a unique ID to the customer using the static variable nextID
		this.ID = nextID++;
		// assigning the age, name, and phone number to the corresponding instance variables
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// getter method for getAge method
	public int getAge() {
		return age;
	}

	// setter method for age 
	public void setAge(int age) {
		this.age = age;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// setter method for setName method
	public void setName(String name) {
		this.name = name;
	}

	// getter method for phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// setter method for phone number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// override the toString() method to return a string representation of the Customer object
	@Override
	public String toString() { // toString method with concatenate with inputs
		return ID + " " + name + ", " + phoneNumber + ", " + age;
	}

	// override the compareTo() method from the Comparable interface to compare Customers by their age
	@Override
	public int compareTo(Customer other) {
		return Integer.compare(age, other.age);
	}
}

