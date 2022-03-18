package section17;

import java.io.File;
import java.io.IOException;

public class Class_198 {
	public static void main(String[] args) throws IOException{
		
		
		File directory = new File("C:\\Users\\USER\\Desktop\\Java-Full-Stack-Developer\\Test");
		// Creating a directory 
		directory.mkdir();
		
		File file = new File("C:\\\\Users\\\\USER\\\\Desktop\\\\Java-Full-Stack-Developer\\\\Test\\File inside the new directory.txt");
			file.createNewFile();
	}	
}
