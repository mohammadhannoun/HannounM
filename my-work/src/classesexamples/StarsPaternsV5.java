package classesexamples;

import javax.swing.JOptionPane;

public class StarsPaternsV5 {
	public static void main(String[] args) {
		String numberOfAstriks=JOptionPane.showInputDialog("Enter the number of astriks : ");
		int numberOfAstriks2=Integer.parseInt(numberOfAstriks);
		int z=numberOfAstriks2-1;
		for(int x=1;x<=numberOfAstriks2;x++) {
			if(x>=2) {
			z=z-1;
					}
			for(int y=(z-1);y>=0;y--) {
				System.out.print(" ");
				}
			for(int e=1;e<=x;e++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
