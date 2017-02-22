/**
 * Algorithms-In-Java
 * RegexForIPAddress.java
 */
package com.deepak.algorithms.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expression for IP Address
 * 
 * @author Deepak
 */
public class RegexForIPAddress {

	/**
	 * Method to check for valid ip address
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(matchIPAddress("1.1.1.1")); // true
		System.out.println(matchIPAddress("255.255.255.255")); // true
		System.out.println(matchIPAddress("192.168.1.1")); // true
		System.out.println(matchIPAddress("127.0.0.1")); // true
		System.out.println(matchIPAddress("26.10.2.10")); // true
		System.out.println(matchIPAddress("10.10.10")); // false
		System.out.println(matchIPAddress("a.a.a.a")); // false
		System.out.println(matchIPAddress("999.10.10.20")); // false
		System.out.println(matchIPAddress("22.2222.22.2")); // false
		System.out.println(matchIPAddress("127.0.0.310")); // false
		System.out.println(matchIPAddress("127.0.0.1101")); // false
	}

	/**
	 * Method to check for a valid IP Address
	 * Explanation :
	 * => A valid IP address will have 4 sets,
	 * 		[0-255].[0-255].[0-255].[0-255]
	 * 
	 * Explanation of Regular Expression :
	 * 
	 * There will be 4 groups here,
	 * ^ - start of the line
	 * ( - start of group #1
	 * [01]?\\d\\d? - Can be one or two digits. If three digits appear, it must start either 0 or 1
	 * e.g ([0-9], [0-9][0-9],[0-1][0-9][0-9])
	 * | - ...or
	 * 2[0-4]\\d - start with 2, follow by 0-4 and end with any digit (2[0-4][0-9])
	 * | - ...or
	 * 25[0-5] - start with 2, follow by 5 and ends with 0-5 (25[0-5])
	 * ) - end of group #2
	 * \. - follow by a dot "."
	 * .... - repeat with 3 times (3x)
	 * $ - end of the line
	 * 
	 * @param input
	 * @return {@link boolean}
	 */
	public static boolean matchIPAddress(String input) {
		String regexforIPAddress = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		Pattern pattern = Pattern.compile(regexforIPAddress);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

}
