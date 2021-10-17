package external_exercises;

import javax.swing.JOptionPane;

public class EncAlg {
	public static void main(String[] args) {
		String sentence =JOptionPane.showInputDialog("Write your text : ");
		char[] d =sentence.toCharArray();
		for(int i=0; i<d.length; i++) {
			d[i]=8*10;
		}
		System.out.print("encrypted : "+d[0]);
	}
}
