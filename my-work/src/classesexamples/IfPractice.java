package classesexamples;

import javax.swing.JOptionPane;

public class IfPractice {
	public static void main(String[] args) {
		String salary=JOptionPane.showInputDialog("Current Salary : ");
		double salaryTwo=Double.parseDouble(salary);
		String experience=JOptionPane.showInputDialog("Yrars of experience : ");
		int experienceTwo=Integer.parseInt(experience);
		double a=salaryTwo;
		if(experienceTwo>=2&&experienceTwo<3) {
			salaryTwo=salaryTwo+(salaryTwo*0.05);
			System.out.println("New salary with the bonus="+salaryTwo+"$");
			System.out.println("Old salary without the bonus="+a+"$");
			System.out.println("The added bonus = "+(a*0.05)+"$");
			}
		else if(experienceTwo>=3) {
			salaryTwo=salaryTwo+(salaryTwo*0.15);
			System.out.println("New salary with the bonus="+salaryTwo+"$");
			System.out.println("Old salary without the bonus="+a+"$");
			System.out.println("The added bonus = "+(a*0.15)+"$");
		}
		else {
			System.out.println("No bonus is added!");
		}
	}

}
