package edu.htu.programming;
import java.util.Scanner;
public class GradesAverage {
	public static void main(String[] args) {
		Scanner n1=new Scanner(System.in);
		int grades[]=new int[5];
		int sum=0;
		for(int i=0; i<grades.length; i++) {
			System.out.print("Please enter grade number"+(i+1)+" : ");
			grades[i]=n1.nextInt();
			sum +=grades[i];
			}
		for(int j=0; j<grades.length; j++) {
			System.out.println("grade number "+(j+1)+" is : "+grades[j]);
		}
		System.out.print("The average is : "+(sum/grades.length));
		n1.close();
	}
}
