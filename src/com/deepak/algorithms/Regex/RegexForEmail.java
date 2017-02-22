/**
 * Algorithms-In-Java
 * RegexForEmail.java
 */
package com.deepak.algorithms.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expression for email address
 * 
 * @author Deepak
 */
public class RegexForEmail {

	/**
	 * Method to check for valid email
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(matchEmail("email@example.com")); // true
		System.out.println(matchEmail("firstname.lastname@example.com")); // true
		System.out.println(matchEmail("abc123@example.com")); // true
		System.out.println(matchEmail("-23-ab@example.com")); // true
		System.out.println(matchEmail("ABC#123$xyz*456@example.com")); // true
		System.out.println(matchEmail("a b@example.com")); // false
		System.out.println(matchEmail("abc..123@example.com")); // false
		System.out.println(matchEmail("email@.example.com")); // false
		System.out.println(matchEmail("@example.com")); // false
		System.out.println(matchEmail("abc_xyz")); // false
		System.out.println(matchEmail("email@example..")); // false
	}

	/**
	 * Method to check for a valid email address
	 * Explanation :
	 * => The local part of email can accept any of these,
	 * 		Upper case and lower case English alphabets (A-Z, a-z)
	 * 		Digits 0-9
	 * 		Characters ! # $ % & ' * + - / = ? ^ _ ` { | } ~
	 * 		Character . (provided that it is not the first/last character) and it does not appear two or more times consecutively
	 * 
	 * Explanation of Regular Expression :
	 * 
	 * There will be 4 groups here,
	 * For groups, we can use [A-Z0-9_!#$%&'*+/=?`{|}~^-]
	 * ^ - start of the string
	 * $ - end of the string
	 * 
	 * So, first group + any character + second group + @ + third group + any character + fourth group
	 * first group and second group will be same
	 * third group and fourth group will be same
	 * 
	 * And, we will be using case insensitive here, since we can have A-Z or a-z
	 * 
	 * @param input
	 * @return {@link boolean}
	 */
	public static boolean matchEmail(String input) {
		String regexforEmail = "^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regexforEmail, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

}
