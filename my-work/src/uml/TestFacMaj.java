package uml;

import java.util.List;
import java.util.ArrayList;

public class TestFacMaj {
	public static void main(String[] args) {
		Major m1 = new Major(1, "Computer Science");
		Major m2 = new Major(2, "Cyber Security");
		Major m3 = new Major(3, "Data Science");
		
		List<Major> majors = new ArrayList<Major>();
		majors.add(m1);
		majors.add(m2);
		majors.add(m3);
		
		Faculty IT = new Faculty(1, "IT", majors);
		
		System.out.println(IT);
	}
}
