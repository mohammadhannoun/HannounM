package edu.htu.assignment;
import javax.swing.JOptionPane;
public class GradeCalculator {
	static String choice;
	static int subsNumber;
	static int subsHours;
	static int hours;
	static double grade;
	static double sum;
	public static void main(String[] args) {
		calculation();
		semesterGrade();
	}
	public static String print(String message) {
		choice= JOptionPane.showInputDialog(message);
		choice= choice.toLowerCase();
		return choice;
	}
	public static int subsAndHours() {
		print("Enter the number of subjects: ");
		subsNumber= Integer.parseInt(choice);
		print("Enter the total number of hours for the semester: ");
		subsHours= Integer.parseInt(choice);
		return subsNumber;
	}
	public static double calculation() {
		subsAndHours();
		for(int i=0; i<subsNumber; i++) {
			print("Enter the grade of the subject number "+(i+1)+" :");
			grade= Double.parseDouble(choice);
			
			print("Enter the credit hours of subject number "+(i+1)+" :");
			hours= Integer.parseInt(choice);
			sum+= (grade*hours);
		}
		return sum;
	}
	public static void semesterGrade() {
	double finalGrade= sum/subsHours;
	char gradeLetter = 0;
	if(finalGrade>=3.6&&finalGrade<=4.0) {
		gradeLetter='D';
	}
	else if (finalGrade>=2.8&&finalGrade<=3.59) {
		gradeLetter='M';
	}
	else if(finalGrade>=2.4&&finalGrade<=2.79) {
		gradeLetter='P';
	}
	else if(finalGrade<2.4) {
		gradeLetter='F';
	}
	System.out.println("Your semester's GPA: "+finalGrade);
	System.out.println("Your semester's grade in letters: "+gradeLetter);
	}
}
