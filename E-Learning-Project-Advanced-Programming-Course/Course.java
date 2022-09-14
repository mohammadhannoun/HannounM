package srs20120042;

public class Course {

	private String id;
	private String name;
	private int creditHours;
	//default constructor
	public Course() {
		id = "-1";
		name = "No name";
		creditHours = -1;
	}
	//parameterized constructor that takes the id, name, and creditHours as arguments
	public Course(String id, String name, int creditHours) {
		setId(id);
		setName(name);
		setCreditHours(creditHours);
	}
	//Getters and setters for the attributes
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

	public int getCreditHours() {
		return creditHours;
	}
	
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	//toString method that returns the id, name, and creditHours of a course as a String
	@Override
	public String toString() {
		return  "[id=" + id + ", name=" + name + ", creditHours=" + creditHours + "]";
	}

	

}
