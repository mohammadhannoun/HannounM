package edu.htu.programming;

import javax.swing.JOptionPane;

public class EncryptionAlgorithm {
	public static void main(String[] args) {
		String sentence=JOptionPane.showInputDialog("Write your text : ");
		char[] arrOne=sentence.toCharArray();
		for(int i=0; i<arrOne.length; i++) {
			if((arrOne[i]>=97&&arrOne[i]<122)||(arrOne[i]>=65&&arrOne[i]<90)) {
				arrOne[i] +=1;
			}
			else if(arrOne[i]==90) {
				arrOne[i] ='&';
			}
			else if(arrOne[i]==122) {
				arrOne[i] ='*';
			}
		}
		String encrypted=new String(arrOne);
		System.out.println("Your encrypted text : "+encrypted);
		for(int j=0; j<arrOne.length; j++) {
			if((arrOne[j]>=98&&arrOne[j]<=122)||(arrOne[j]>=66&&arrOne[j]<=90)) {
				arrOne[j] -=1;
			}
			else if(arrOne[j]=='&') {
				arrOne[j] ='Z';
			}
			else if(arrOne[j]=='*') {
				arrOne[j] ='z';
			}
		}
		String decrypted=new String(arrOne);
		System.out.print("Your decrypted text : "+decrypted);

	}
}
