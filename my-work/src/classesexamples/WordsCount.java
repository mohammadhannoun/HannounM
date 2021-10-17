package classesexamples;
import java.util.Scanner;
public class WordsCount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write : ");
		String statement=scan.nextLine();
		char[] chars=statement.toCharArray();
		int spaces=0;
		int spacesw=1;
		for(int i=0; i<chars.length; i++) {
			if(chars[i]==' ') {
				spaces++;
				spacesw++;
			}
		}
		System.out.println("Number of Spaces = "+spaces);
		System.out.println("Number of words = "+spacesw);
		scan.close();
	}
}
