package external_exercises;

import javax.swing.JOptionPane;

public class ExThirtyFive {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Enter the number of sides : ");
		int n1=Integer.parseInt(num1);
		String num2 =JOptionPane.showInputDialog("Enter the length of the side : ");
		double n2=Double.parseDouble(num2);
		double area =areaOfPolygon(n1, n2);
		System.out.print("Area of the polygon = "+area);
	}public static double areaOfPolygon(int n1, double n2) {
		double area=(n1*Math.pow(n2, 2))/(4*Math.tan(Math.PI/n1));
		return area;
		}
}
