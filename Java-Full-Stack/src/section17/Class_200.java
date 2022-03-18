package section17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class_200 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\Java-Full-Stack-Developer\\Test\\test.txt"));
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file isn't found!");
		} catch (IOException e) {
			System.out.println("The file couldn't be read!");
		}
		
	}
}
