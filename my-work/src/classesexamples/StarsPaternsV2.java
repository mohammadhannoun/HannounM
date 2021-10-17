package classesexamples;

import javax.swing.JOptionPane;

public class StarsPaternsV2 {
	public static void main(String[] args) {
		String n1=JOptionPane.showInputDialog("Enter the number of astriks you want : ");
		int n2=Integer.parseInt(n1);
		
		for(int x=1;x<=n2;x++) {
			System.out.println("*");
		}
		
	}

}
