package edu.htu.programming;

import javax.swing.JOptionPane;

public class PracticeTwo {

	public static void main(String[] args) {

		String value1=JOptionPane.showInputDialog("Enter the first number : ");
		int number1=Integer.parseInt(value1);
		
		String value2=JOptionPane.showInputDialog("Enter the second number : ");
		int number2=Integer.parseInt(value2);
		
		System.out.println(number1+number2);
	}

}
