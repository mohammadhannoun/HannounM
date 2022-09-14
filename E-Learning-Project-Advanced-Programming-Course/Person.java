package srs20120042;

public class Person {
	HTUConfig std = HTUConfig.getInstance();
	private int id;
	private String name;
	private School school;

	// default Constructor
	public Person() {
		id = -1;
		name = "No name";
		school = null;
	}

	// Parametrized constructor that takes the id, name, and school as arguments
	public Person(int id, String name, School school) {
		setId(id);
		setName(name);
		setSchool(school);
	}

	// Getters and setters for the attributes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public HTUConfig getStd() {
		return std;
	}

	public void setStd(HTUConfig std) {
		this.std = std;
	}

	// toString method that returns the id, name, school, and the year and semester
	// as String
	@Override
	public String toString() {
		return "\n" + "Person [id=" + id + ", name=" + name + ", school=" + school + getStd() + "]";
	}

}
