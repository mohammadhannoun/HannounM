package section17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class_201 {
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(new File("C:\\Users\\USER\\Desktop\\Java-Full-Stack-Developer\\Test\\test.txt"));
			String line;
				while(reader.hasNext()) {
					line = reader.nextLine();
					System.out.println(line);
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
