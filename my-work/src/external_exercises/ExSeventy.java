package external_exercises;

import javax.swing.JOptionPane;

public class ExSeventy {
	public static void main(String[] args) {
		String str1= JOptionPane.showInputDialog("First String : ");
		String str2= JOptionPane.showInputDialog("Second String : ");
		if(str1.length()>str2.length()) {
			System.out.print(str2+str1+str2);
		}
		else if(str2.length()>str1.length()) {
			System.out.print(str1+str2+str1);
		}
	}
}
