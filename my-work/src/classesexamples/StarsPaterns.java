package classesexamples;

import javax.swing.JOptionPane;

public class StarsPaterns {
	public static void main(String[] args) {
		String in1=JOptionPane.showInputDialog("Enter the number of astriks you want : ");
		int in2=Integer.parseInt(in1);
		
		for(int x=1;x<=in2;x++) {
			System.out.print("*");
		}
		
	}

}
