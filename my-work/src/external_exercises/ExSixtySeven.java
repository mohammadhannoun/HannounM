package external_exercises;

import javax.swing.JOptionPane;

public class ExSixtySeven {
	public static void main(String[] args) {
		String sen= JOptionPane.showInputDialog("Write your sentence : ");
		String senV2= JOptionPane.showInputDialog("Write the word you want to insert : ");
		char[] arr= sen.toCharArray();
		int contr= 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==' ') {
				contr=i;
			}
		}
		System.out.print(sen.substring(0, (contr+1))+senV2+sen.substring(contr));
	}
}