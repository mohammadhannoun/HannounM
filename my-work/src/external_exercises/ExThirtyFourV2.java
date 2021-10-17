package external_exercises;
import java.util.Scanner;
public class ExThirtyFourV2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length : ");
		double s=scan.nextDouble();
		double area=areaOfHexagon(s);
		System.out.print("Area = "+area);
		scan.close();
	}
public static double areaOfHexagon(double s){
	double area=(6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6));
	return area;
}
}
