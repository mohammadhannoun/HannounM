package uml;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Student {
	
	private String id;
	private String name;
	private List<StudentCourses> studentCourses = new ArrayList<StudentCourses>();
	
	public Student() {
		
	}
	public void addStudentCourses(StudentCourses ... course) {
		for (int i = 0; i < course.length; i++) {
			studentCourses.add(course[i]);
		}
	}
	public Student(String id, String name) {
		setId(id);
		setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<StudentCourses> getCourses() {
		return studentCourses;
	}

	public void setCourses(List<StudentCourses> studentCourses) {
		this.studentCourses = studentCourses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", " + studentCourses + "]";
	}
	
}
