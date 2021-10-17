package external_exercises;
import java.io.File;
public class ExFourtyFive {
	public static void main(String[] args) {
		String fileName= "D:/Test/Test.txt";
		File f= new File(fileName);
		long fileSize= f.length();
		System.out.println("The size of this file = "+fileSize+" Bytes");
	}
}
