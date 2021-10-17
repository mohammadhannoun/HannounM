package external_exercises;
import java.util.Scanner;
public class ExEleven {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius=scan.nextDouble();
		double area=(22/7)*Math.pow(radius, 2);
		double perimeter=(22/7)*2*radius;
		System.out.println("Area of the circle = "+area);
		System.out.println("Perimeter of teh circle = "+perimeter);
		scan.close();
	}
}
