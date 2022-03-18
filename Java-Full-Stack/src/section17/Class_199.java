package section17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Class_199 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\USER\\Desktop\\Java-Full-Stack-Developer\\Test");
		file.mkdir();
		
		file = new File("C:\\\\Users\\\\USER\\\\Desktop\\\\Java-Full-Stack-Developer\\\\Test\\test.txt");
		/*try {
			file.createNewFile();
			System.out.println("The file has been created !!");
		} catch (IOException e) {
			System.out.println("The file couldn't be created !!");
		}*/
		
		// if we didn't make FileWriter(file, boolean) 
		// when we run the program
		// each time the content of the file will be overriden
		// using the boolen --> appended and not overriden!!
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.newLine();
			bw.write("Not Overriden");
			bw.newLine();
			bw.write("Not Overriden");
			bw.newLine();
			bw.write("Not Overriden");
			bw.newLine();
				System.out.println("Writing onto the file has been completed !!");
			bw.close();
		} catch (IOException e) {
			System.out.println("An error occurd while writing onto the file");
		}
	}
}
