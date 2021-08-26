package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		System.out.println();
		// Shift b seven bits to the right
	int numShifted = b >> 7;
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
	numShifted = numShifted & 1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(numShifted);
		//Use this method to print the remaining 7 bits of b

		numShifted = (b >> 6) & 1;
		System.out.print(numShifted);
		
		System.out.print((b >> 5) & 1);
		System.out.print((b >> 4) & 1);
		System.out.print((b >> 3) & 1);
		System.out.print((b >> 2) & 1);
		System.out.print((b >> 1) & 1);
		System.out.print((b >> 0) & 1);
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte)64);
	}
}
