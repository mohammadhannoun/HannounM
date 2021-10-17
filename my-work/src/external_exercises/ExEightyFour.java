package external_exercises;

import javax.swing.JOptionPane;

public class ExEightyFour {
	public static void main(String[] args) {
		String word= JOptionPane.showInputDialog("Write a word : ");
		String sub= word.substring(word.length()-3);
		System.out.println(sub+word+sub);
	}
}
