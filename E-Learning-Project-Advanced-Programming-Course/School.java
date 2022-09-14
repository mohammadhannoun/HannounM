package srs20120042;

import java.util.List;
import java.util.ArrayList;

public class School {

	private String id;
	private String name;
	private String abbreviation;
	private List<Program> schoolPrograms;

	// Default constructor
	public School() {
		id = "-1";
		name = "No name";
		abbreviation = "No abbreviation";
	}

	// Parameterized Constructor, that takes the id, name, and abbreviation as
	// arguments
	public School(String id, String name, String abbreviation) {
		// Construction of schoolPrograms object
		schoolPrograms = new ArrayList<Program>();
		setId(id);
		setName(name);
		setAbbreviation(abbreviation);
	}

	// Getters and setters for the all of the attributes
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

	public List<Program> getSchoolPrograms() {
		return schoolPrograms;
	}

	public void setSchoolPrograms(List<Program> schoolPrograms) {
		this.schoolPrograms = schoolPrograms;
	}

	// A method to add programs to a school
	public void addPrograms(Program... programs) {
		for (int i = 0; i < programs.length; i++) {
			if (schoolPrograms.contains(programs[i]))
				continue;
			schoolPrograms.add(programs[i]);
		}
	}

	// A method to remove programs for a school
	public void removePrograms(Program... programs) {
		for (int i = 0; i < programs.length; i++) {
			schoolPrograms.remove(programs[i]);
		}
	}

	// A method to show all the programs of a school
	public void showSchoolPrograms() {
		System.out.println(this.name + " Programs are : ");
		for (int i = 0; i < schoolPrograms.size(); i++) {
			System.out.println(schoolPrograms.get(i));
		}
	}

	@Override
	public String toString() {
		return "\n" + "School [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + "]";
	}

}
