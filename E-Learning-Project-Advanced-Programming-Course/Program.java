package srs20120042;

import java.util.ArrayList;
import java.util.List;

public class Program {

	private String id;
	private String name;
	private String abbreviation;
	private List<Course> programCourses;

	// default constructor
	public Program() {
		id = "-1";
		name = "No name";
		abbreviation = "No abbreviation";
	}

	// Parametrized constructor that takes the id, name, abbreviation as arguments
	public Program(String id, String name, String abbreviation) {
		programCourses = new ArrayList<Course>();
		setId(id);
		setName(name);
		setAbbreviation(abbreviation);
	}

	// getters and setters for the attributes
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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public List<Course> getProgramCourses() {
		return programCourses;
	}

	public void setProgramCourses(List<Course> programCourses) {
		this.programCourses = programCourses;
	}

	// method to add courses to a program
	public void addCourse(Course... course) {
		for (int i = 0; i < course.length; i++) {
			if (programCourses.contains(course[i]))
				continue;
			programCourses.add(course[i]);
		}
	}

	// method to remove courses from a program
	public void removeCourse(Course... course) {
		for (int i = 0; i < course.length; i++) {
			programCourses.remove(course[i]);
		}
	}

	// method to show the courses of a program
	public void showProgramCourses() {
		System.out.println(this.name + " Program Courses = ");
		for (int i = 0; i < programCourses.size(); i++) {
			System.out.println(programCourses.get(i));
		}
	}

	// toString method the returns the id, name, and abbreviation of a program
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + "]";
	}

}
