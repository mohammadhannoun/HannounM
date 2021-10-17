package external_exercises;

import java.util.Scanner;

public class ExFiftyFive {
	public static void main(String[] args) {
		System.out.print("Seconds = ");
		Scanner scan= new Scanner(System.in);
		int seconds= scan.nextInt();
		int hours = seconds/3600;
		int minutes = (seconds%3600)/60;
		seconds = (seconds%3600)%60;
		System.out.print(hours+" : "+minutes+" : "+seconds);
		scan.close();
	}
}
