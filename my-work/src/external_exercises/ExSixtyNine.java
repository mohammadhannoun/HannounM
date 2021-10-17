package external_exercises;
import java.util.Scanner;
public class ExSixtyNine {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Write your sentence :");
		String sen= scan.nextLine();
		
		System.out.println(sen.substring(0,(sen.length()/2)));
	}
}
