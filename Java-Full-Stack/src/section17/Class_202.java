package section17;

import java.io.File;

public class Class_202 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\USER\\Desktop\\Java-Full-Stack-Developer\\Test\\dme.txt");
		if(file.delete()) {
			System.out.println("The file has been deleted !!");
		} else {
			System.out.println("An error occured while trying to delete the file !!");
		}
	}
}
