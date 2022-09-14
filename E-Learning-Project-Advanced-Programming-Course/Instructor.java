package srs20120042;

public class Instructor extends Person {

	private double salary;

	// default constructor
	public Instructor() {
		super();
		salary = 0;
	}

	// Parametrized constructor that takes id, name, school, and salary as arguments
	public Instructor(int id, String name, School school, double salary) {
		super(id, name, school);
		setSalary(salary);
	}

	// getter and setter for the salary attribute
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString method that returns the name of the instructor as a String as well
	// as the year and semester
	@Override
	public String toString() {
		return "[id=" + getId() + ", name=" + getName() + ", school=" + getSchool() + getStd() + "]";
	}
}
