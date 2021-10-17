package external_exercises;
import java.util.Scanner;
public class ExThirtyFour {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length : ");
		double length=scan.nextDouble();
		Double areaOfHexagon=(3*Math.sqrt(3)*Math.pow(length, 2))/2;
		System.out.print("Area of Hexagon = "+areaOfHexagon);
		scan.close();
	}
}