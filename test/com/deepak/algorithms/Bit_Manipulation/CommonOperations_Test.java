/**
 * Algorithms-in-Java
 * CommonOperations_Test.java
 */
package com.deepak.algorithms.Bit_Manipulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.algorithms.Bit_Manipulation.CommonOperations;

/**
 * Test cases for common operations on bits
 * 
 * @author Deepak
 */
public class CommonOperations_Test {

	/* Initialize variables */
	int eightBitNumber;
	int secondNumber;

	/* Setup test cases */
	@Before
	public void setup() {
		eightBitNumber = 21;
		secondNumber = 255;
	}

	/**
	 * Test case to check get bit operation
	 */
	@Test
	public void testGetBitOperation() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(eightBitNumber), "0001 0101");
		Assert.assertTrue(CommonOperations.getBit(21, 2));
		Assert.assertFalse(CommonOperations.getBit(21, 5));
	}

	/**
	 * Test case to check set bit operation
	 */
	@Test
	public void testSetBitOperation() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(eightBitNumber), "0001 0101");
		/* It remains the same number, since bit at 2nd position is already 1 */
		Assert.assertEquals(CommonOperations.setBit(21, 2), 21);
		/* Number becomes 29 once we flip the bit at position three */
		Assert.assertEquals(CommonOperations.setBit(21, 3), 29);
	}

	/**
	 * Test case to check clear bit operation
	 */
	@Test
	public void testClearBitOperation() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(eightBitNumber), "0001 0101");
		/* It remains the same number, since bit at 3rd position is already 1 */
		Assert.assertEquals(CommonOperations.clearBit(21, 3), 21);
		/* Number becomes 17 once we flip the bit to 0 at position 2 */
		Assert.assertEquals(CommonOperations.clearBit(21, 2), 17);
	}

	/**
	 * Test case to check update bit operation
	 */
	@Test
	public void testUpdateBitOperation() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(eightBitNumber), "0001 0101");
		/* It remains the same, since at 1st position, it's already 0 */
		Assert.assertEquals(CommonOperations.updateBit(21, 0, 1), 21);
		/* Number became 20 once we flip the bit at 0th position to 0 */
		Assert.assertEquals(CommonOperations.updateBit(21, 0, 0), 20);
		/* Number became 29 once we flip the bit at 3rd position to 1 */
		Assert.assertEquals(CommonOperations.updateBit(21, 3, 1), 29);
	}

	/**
	 * Test case to check toggle bit operation
	 */
	@Test
	public void testToggleBitOperation() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(eightBitNumber), "0001 0101");
		Assert.assertEquals(CommonOperations.toFullBinaryString(CommonOperations.toggleBit(eightBitNumber, 2)), "0001 0001");
		Assert.assertEquals(CommonOperations.toFullBinaryString(CommonOperations.toggleBit(eightBitNumber, 5)), "0011 0101");
	}

	/**
	 * Test case to clear most significant bits through I
	 * NOTE : Count starts from 1 i.e 4 Bits means total 4 bits
	 */
	@Test
	public void testClearMSBThroughI() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(secondNumber), "1111 1111");
		Assert.assertEquals(CommonOperations.toFullBinaryString(CommonOperations.clearMSBthroughI(255, 4)), "0000 1111");
		Assert.assertEquals(CommonOperations.clearMSBthroughI(255, 4), 15);
	}

	/**
	 * Test case to clear least significant bits through I
	 * NOTE : Count starts from 0 i.e 4 means total of 5 bits
	 */
	@Test
	public void testClearLSBThroughI() {
		Assert.assertEquals(CommonOperations.toFullBinaryString(secondNumber), "1111 1111");
		Assert.assertEquals(CommonOperations.toFullBinaryString(CommonOperations.clearLSBthroughI(255, 3)), "1111 0000");
		Assert.assertEquals(CommonOperations.clearLSBthroughI(255, 4), 224);
	}

}