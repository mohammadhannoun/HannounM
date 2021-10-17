package oop;
import java.util.Scanner;
public class DemoStudent {
	public static void main(String[] args) {
		Student s1= new Student();

		Scanner scan= new Scanner(System.in);
		for(int i=0; i<2; i++) {	
		System.out.print("Enter student's name : ");
		s1.studentName= scan.nextLine();
		System.out.print("Enter your entry year : ");
		s1.entryYear= scan.nextLine();
		System.out.print("Enter school's name : ");
		s1.schoolName= scan.nextLine();
		System.out.print("Enter student's Id : ");
		s1.studentId= scan.nextLine();
		s1.student();
		}
		scan.close();
	}
}
