package model;

public class ChecagemDados {
	private final static String EMPTY_STRING = "";
	
	public static boolean checkIfStringIsNullOrEmpty(String stringToBeChecked){
		return stringToBeChecked == null || stringToBeChecked.equals(EMPTY_STRING);	
	}
	
}
