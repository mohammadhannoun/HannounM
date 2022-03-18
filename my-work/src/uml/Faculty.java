package uml;

import java.util.List;

public class Faculty {
	private int id;
	private String name;
	private List<Major> majors;

	public Faculty() {
		
	}
	
	public Faculty(int id, String name, List<Major> majors) {
		setId(id);
		setName(name);
		setMajors(majors);
	}

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

	public List<Major> getMajors() {
		return majors;
	}

	public void setMajors(List<Major> majors) {
		this.majors = majors;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", majors" + majors + "]";
	}

}
