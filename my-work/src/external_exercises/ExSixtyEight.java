package external_exercises;

import javax.swing.JOptionPane;

public class ExSixtyEight {
	public static void main(String[] args) {
		String sen= JOptionPane.showInputDialog("Write yor sentence : ");
		char[] arr= sen.toCharArray();
		int ctr= 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr[arr.length-1]) {
				ctr= i;
				}
			}
		for(int j=0; j<4; j++) {
		System.out.print(sen.substring(ctr-2));
		}
	}
}
