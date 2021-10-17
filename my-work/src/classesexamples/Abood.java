package classesexamples;

import javax.swing.JOptionPane;

public class Abood {

	public static void main(String[] args) {
	int x=1;
	do {
	String angleOne=JOptionPane.showInputDialog("Angle A (In Degrees) : ");
	String angleTwo=JOptionPane.showInputDialog("Angle B (In Degrees) : ");
	String angleThree=JOptionPane.showInputDialog("Angle C (In Degrees) : ");
	String angleFour=JOptionPane.showInputDialog("Angle D (In Degrees) : ");
	double A=Double.parseDouble(angleOne);
	double B=Double.parseDouble(angleTwo);
	double C=Double.parseDouble(angleThree);
	double D=Double.parseDouble(angleFour);
	double sum=A+B+C+D;
		if (sum==360) {
			if(A==90&&B==90&&C==90&&D==90) {
				System.out.println("Rectangle or Square");
			}
			else if(A+C==180&&B+D==180) {
				System.out.println("A cyclic quadrilateral");
			}
			else if(A==C&&B==D) {
				System.out.println("Parallelogram");
			}
			else {
			System.out.println("“A Non-cyclic quadrilateral”");
			}
		x=0;
	}
		else {
			System.out.println("“re-enter the angles”");
			}
}while(x==1);

	
	
	
	}

}
