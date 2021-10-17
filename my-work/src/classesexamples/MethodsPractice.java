package classesexamples;
import javax.swing.JOptionPane;
public class MethodsPractice {
	public static void main(String[] args) {
		result();
	}public static int grades(String msg) {
		String gradesV1 =JOptionPane.showInputDialog(msg);
		int gradesV2 =Integer.parseInt(gradesV1);
		return gradesV2;
	}public static int average() {
		int gradeOne =grades("Enter the first grade : ");
		int gradeTwo =grades("Enter the second grade : ");
		int gradeThree =grades("Enter the third grade : ");
		int avg= (gradeOne+gradeTwo+gradeThree)/3;
		return avg;
	}public static void result() {
		int result= average();
		System.out.println("Average = "+result);
	}
}
