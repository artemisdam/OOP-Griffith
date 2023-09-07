/* Name: Damla Patar
   ID: 3104152
   Date: 13/05/2023 */


@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

    // Constructor for InsufficientFundsException
    // Takes a String parameter 'message' representing the error message
    InsufficientFundsException(String message) {
        super(message); // Call the constructor of the parent class (Exception) with the provided error message
    }
}
