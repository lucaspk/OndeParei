package model;

public class ValidacaoDados {
	
	private final static String NUMBERS_ONLY_REGEX = "[0-9]{2,5}";
	
	public static boolean checkNumbersOnlyStringFormat(String stringToBeChecked){
		return stringToBeChecked.matches(NUMBERS_ONLY_REGEX);
	}

	public static String getNumbersOnlyRegex() {
		return NUMBERS_ONLY_REGEX;
	}
	
	
	
}