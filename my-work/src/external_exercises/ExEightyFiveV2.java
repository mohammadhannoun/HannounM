package external_exercises;
import java.util.Scanner;
public class ExEightyFiveV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Write : ");
		String sen= scan.nextLine();
		System.out.println(sen.startsWith("Hello"));
		scan.close();
	}
}
