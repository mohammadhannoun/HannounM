package oop.full;

public class Average {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum = " + sum + " , " + "Average = " + (sum/args.length));
	}
}
