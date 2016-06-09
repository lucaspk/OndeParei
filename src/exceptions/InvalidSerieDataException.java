package exceptions;

public class InvalidSerieDataException extends Exception {

	public InvalidSerieDataException(String string, String regex) {
		super("The value "+ string +" is invalid, because he doesn't match with the regex format "+ regex +".");
	}
	
	public InvalidSerieDataException(String message) {
		super(message);
	}

	public InvalidSerieDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidSerieDataException(Throwable cause) {
		super(cause);
	}
	
}
