package uml;

import java.util.List;
import java.util.ArrayList;

public class TestStdCrse {
	public static void main(String[] args) {
		Course advProg = new Course("1","Advanced Programming");
		Course Net = new Course("2", "Networking");
		
		StudentCourses sNt = new StudentCourses(2021, 1, 2, 4, Net);
		StudentCourses sAd = new StudentCourses(2021, 1, 1, 4, advProg);
		
		List<StudentCourses> l1 = new ArrayList<StudentCourses>();
		l1.add(sNt);
		l1.add(sAd);
		
		Student s1 = new Student("1", "Mohmad");
		Student s2 = new Student("2", "Feras");
		
		s2.addStudentCourses(sAd);
		
		s1.addStudentCourses(sNt);
		s1.addStudentCourses(sAd);
		
		System.out.println(s1.toString());
		System.out.println(s2);
		
	}
}
