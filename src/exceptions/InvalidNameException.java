package exceptions;

public class InvalidNameException extends Exception {

	public InvalidNameException() {
		super("The name is invalid, because is null or empty.");
	}
	
	public InvalidNameException(String message) {
		super(message);
	}

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
	}
	
}