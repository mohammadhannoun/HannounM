package oop.full.revision;

public class Average {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println("Grade = " + args[i]);
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Average = " + (sum/args.length));
	}
}
