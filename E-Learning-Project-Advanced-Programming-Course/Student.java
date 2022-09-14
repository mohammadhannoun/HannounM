package srs20120042;

import java.util.Map;
import java.util.HashMap;

public class Student extends Person {

	private Degree degree;
	private Program program;
	private String studyType;
	private int totalHours;
	private HashMap<Section, String> studentSections;
	public boolean payment;
	
	// Default constructor
	public Student() {
		super();
		totalHours = 0;
		payment = false;
	}

	// Parametrized constructor
	public Student(int id, String name, School school, Degree degree, Program program, String studyType) {
		super(id, name, school);
		studentSections = new HashMap<Section, String>();
		setDegree(degree);
		setProgram(program);
		setStudyType(studyType);
		payment = false;
	}

	// from line 32 to line 63 getter and setters
	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public HashMap<Section, String> getStudentSections() {
		return studentSections;
	}

	public void setStudentSections(HashMap<Section, String> studentSections) {
		if (!payment)
			return;
		this.studentSections = studentSections;
	}

	// A method to add sections to the student (varargs)
	public void addSections(Section... sections) {
		// checking whether the student has paid the fees or not
		if (!payment) {
			return;
		}
		// checking whether the student has exceeded 18 hours
		if (totalHours > 18) {
			System.out.println("You have reached the maximum number of semester hours allowed!");
			return;
		}
		// checking if the student is trying to add multiple sections of the same course
		if (!studentSections.isEmpty()) {
			for (int j = 0; j < sections.length; j++) {
				for (Map.Entry<Section, String> entry : studentSections.entrySet()) {
					if (sections[j].getCourse().getName().equals(entry.getKey().getCourse().getName())) {
						sections[j] = entry.getKey();
					}
				}
			}
		}
		// adding the sections to the studentSections map
		for (int i = 0; i < sections.length; i++) {
			// Checking the total hours after adding the next section in each iteration, so
			// the student can't exceed 18 hours per semester
			if ((totalHours + sections[i].getCourse().getCreditHours()) > 18) {
				System.out.println("You have reached the maximum number of semester hours allowed!" + "\n"
						+ "Remaining credit hours = " + (18 - totalHours));
				break;
			}
			studentSections.putIfAbsent(sections[i], null);
			// incrementing the value of totalHours by the credit hours of a course
			totalHours += sections[i].getCourse().getCreditHours();
		}
	}

	// removing sections from the studentSections map
	public void removeSections(Section... sections) {
		// checking whether the student has section or not
		if (totalHours == 0) {
			System.out.println("The student didn't add any courses this semester!");
			return;
		}
		// removing the section from the map
		for (int i = 0; i < sections.length; i++) {
			studentSections.remove(sections[i]);
			// decrementing the value of totalHours by the credit hours of the removed
			// course
			totalHours -= sections[i].getCourse().getCreditHours();
		}
	}

	// a method to add grade to a each course separately
	public void addGrades(Section section, String grade) {
		studentSections.put(section, grade);
	}

	// a method to get the grade to a specific course
	public String getGrade(Section section) {
		return studentSections.get(section);
	}

	// a method to show the courses of the student in addition to the grade of each
	public void viewGrades() {
		// iterating through the HashMap (studentSection)
		for (Map.Entry<Section, String> entry : studentSections.entrySet()) {
			System.out.println(entry.getKey().getCourse() + "   Grade = " + entry.getValue());
		}
	}

	// a method to calculate the average of the semester
	public void calcSmstrAvg() {
		double sum = 0.0; // Initializing the sum variable (local variable)
		for (Map.Entry<Section, String> entry : studentSections.entrySet()) {
			// transforming from String to Double
			// updating the value of sum
			sum += (entry.getKey().getCourse().getCreditHours() * Double.parseDouble(entry.getValue()));
		}
		System.out.println("Semester Avg = " + (sum / totalHours));
	}

	// a method that returns a string
	@Override
	public String toString() {
		return "Student [id=" + getId() + ", name=" + getName() + ", school=" + getSchool() + getStd() + "]" + "degree="
				+ degree + ", program=" + program + ", studyType=" + studyType + ", studentSections=" + studentSections
				+ "]" + "\n" + "[totalHours=" + totalHours + "]";
	}
}
