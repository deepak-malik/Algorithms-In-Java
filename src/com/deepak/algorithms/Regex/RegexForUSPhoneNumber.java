/**
 * Algorithms-In-Java
 * RegexForUSPhoneNumber.java
 */
package com.deepak.algorithms.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expression for US Phone Numbers
 * 
 * @author Deepak
 */
public class RegexForUSPhoneNumber {

	/**
	 * Main method to test the program 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(matchUSPhoneNumber("4256336014")); // true
		System.out.println(matchUSPhoneNumber(" 4256336014")); // false
		System.out.println(matchUSPhoneNumber("425-633-6014")); // true
		System.out.println(matchUSPhoneNumber("425-633-601")); // false
		System.out.println(matchUSPhoneNumber("425-6336014")); // true
		System.out.println(matchUSPhoneNumber("(425)-633-6014")); // true
		System.out.println(matchUSPhoneNumber("42-33-6014")); // false
		System.out.println(matchUSPhoneNumber("-633-6014")); // false
		System.out.println(matchUSPhoneNumber("6014")); // false
		System.out.println(matchUSPhoneNumber("425-633-60145")); // false
	}

	/**
	 * Method to match US phone number 
	 * Explanation :
	 * => Phone number can be in below format
	 * 		1. First part should have 3 digits
	 * 		2. Second part should have 3 digits
	 * 		3. Third part should have 4 digits
	 * => Now, there could be various possibilities in between,
	 *  i.e we may have a -, a space, no white space or a braces ()
	 *  
	 * Explanation of Regular Expression :
	 * 
	 * There will be 3 groups since I have 3 different blocks in my input.
	 * For groups, we can use [0-9]{3} or [0-9]{4}
	 * ^ - start of the string
	 * $ - end of the string
	 * \\ - matches the character literally
	 * () - capture everything that is enclosed
	 * ? Quantifier - matches between 0 and 1 times
	 * [-.\\s] - Match anything out of these
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
