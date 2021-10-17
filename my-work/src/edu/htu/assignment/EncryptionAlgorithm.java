package edu.htu.assignment;

import javax.swing.JOptionPane;

public class EncryptionAlgorithm {

	public static void main(String[] args) {
		//Taking input from the user as a String
		String sentence=JOptionPane.showInputDialog("Write your text : ");
		//Tranferring the String into an array of characters
		char[] arrOne=sentence.toCharArray();
		/*
		 * Initializing a loop it's length is equal to "arrOne" array length
		 * This loop passes all around the array element by element
		 */
		for(int i=0; i<arrOne.length; i++) {
			//A condition that checks the ASCII value for the read element
			if((arrOne[i]>=0&&arrOne[i]<=255)) {
				//Increasing the ASCII value for the element by 1
				arrOne[i] -=4;
			}
		}
		//Converting the character array into a String
		String encrypted=new String(arrOne);
		//Printing the encrypted text
		System.out.println("Your encrypted text : "+encrypted);
		//Initializing a loop it's length is equal to "arrOne" array length
		for(int j=0; j<arrOne.length; j++) {
			if((arrOne[j]>=1&&arrOne[j]<=256)) {
			//Decreasing the ASCII value for the read element by 1
				arrOne[j] +=4;
			}
		}
		//Converting the character array into a String
		String decrypted=new String(arrOne);
		//Printing the decrypted text
		System.out.print("Your decrypted text : "+decrypted);
	}
}
