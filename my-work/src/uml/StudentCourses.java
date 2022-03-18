package uml;

public class StudentCourses {
	
	private int year;
	private int semester;
	private int section;
	private int grade;
	private Course course;
	
	public StudentCourses() {
		
	}
	
	public StudentCourses(int year, int semester, int section, int grade, Course course) {
		setYear(year);
		setSemester(semester);
		setSection(section);
		setGrade(grade);
		setCourse(course);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "\nStudentCourses [course=" + course + ", year=" + year + ", semester=" + semester + ", section=" + section
				+ ", grade=" + grade + "]";
	}
	
}
