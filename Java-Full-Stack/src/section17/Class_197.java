package section17;

import java.io.File;
import java.io.IOException;

public class Class_197 {
	public static void main(String[] args) {
		// Creating a file on desk
		
		File file = new File("src\\Test.txt");
		try {
			file.createNewFile();
			System.out.println("The file has been created !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
