package srs20120042;

public class Section {

	HTUConfig secYrSr = HTUConfig.getInstance();
	private int sectionNumber;
	private Course course;
	private Instructor instructor;

	// default constructor
	public Section() {
		sectionNumber = -1;
		course = null;
		instructor = null;
	}

	// constructor that takes sectionNumber, course, and instructor as arguments
	public Section(int sectionNumber, Course course, Instructor instructor) {
		setSectionNumber(sectionNumber);
		setCourse(course);
		setInstructor(instructor);
	}

	// getters and setters for the attributes
	public int getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	// Only getter for the secYrSr attribute (read-only)
	public HTUConfig getSecYrSr() {
		return secYrSr;
	}

	// toString method to print the sectionNumber, course, instructor name, year,
	// and semester
	@Override
	public String toString() {
		return "\n" + "[sectionNumber=" + sectionNumber + ", course=" + course + ", instructor=" + instructor.getName()
				+ secYrSr + "]";
	}

}
