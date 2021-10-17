package external_exercises;
import javax.swing.JOptionPane;
public class ExTherteen {
	public static void main(String[] args) {
		String q=JOptionPane.showInputDialog("Enter the height of the rectangle : ");
		double height=Double.parseDouble(q);
		String r=JOptionPane.showInputDialog("Enter the width of the rectangle : ");
		double width=Double.parseDouble(r);
		double area=height*width;
		double perimeter=2*(height+width);
		System.out.println("Area of the rectangle = "+area);
		System.out.println("Perimeter of the rectangle = "+perimeter);
	}
}
