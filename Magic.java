/*
This a small program that performs a mathematical magic trick! 
It will involve performing arithmetic operations on an integer that you choose.
*/
package bwilliams512.magic;

public class Magic {
    	public static void main(String[] args) {
    int myNumber = 1; // Enter any number 
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.println(magicNumber);

	}
    
}
