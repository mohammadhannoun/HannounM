package external_exercises;

import javax.swing.JOptionPane;

public class ExSeventyOne {
	public static void main(String[] args) {
		String str1= JOptionPane.showInputDialog("First String : ");
		String str2= JOptionPane.showInputDialog("Second String : ");
		System.out.print(str1.substring(1)+str2.substring(1));
	}
}
