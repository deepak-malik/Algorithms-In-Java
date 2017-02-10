package com.deepak.algorithms.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForUSPhoneNumber {
	
	public static void main(String[] args) {
		System.out.println(matchUSPhoneNumber("425-633-6014"));
		System.out.println(matchUSPhoneNumber("425-633-601"));
		System.out.println(matchUSPhoneNumber("425-6336014"));
		System.out.println(matchUSPhoneNumber("(425)-633-6014"));
		System.out.println(matchUSPhoneNumber("42-33-6014"));
		System.out.println(matchUSPhoneNumber("-633-6014"));
		System.out.println(matchUSPhoneNumber("6014"));
		System.out.println(matchUSPhoneNumber("425-633-60145"));
	}
	
	/**
	 * Method to match US phone number 
	 * 
	 * @param input
	 * @return {@link boolean}
	 */
	public static boolean matchUSPhoneNumber(String input) {
		String regexforPhone = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regexforPhone);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

}
