package external_exercises;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FibonacciSeries {
	public static void main(String[] args) {
		String nom= JOptionPane.showInputDialog("Enter the element you want : ");
		int[] num= new int[Integer.parseInt(nom)];
		num= fibonacciSeries(Integer.parseInt(nom));
		System.out.println("Series = "+Arrays.toString(num));
	}
	public static int[] fibonacciSeries(int nth) {
		int[] num= new int[nth];
		num[0]=0;
		num[1]=1;
		for(int i= 2; i<nth; i++) {
			num[i]= num[i-1]+num[i-2];
		}
		return num;
	}
}
