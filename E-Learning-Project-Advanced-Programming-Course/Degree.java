package srs20120042;

public class Degree {

	private String degreeName;

	// Default constructor
	public Degree() {
		degreeName = "Bachelor";
	}

	// Parameterized Constructor, that takes the drgree name as an argument
	public Degree(String degreeName) {
		setDegreeName(degreeName);
	}

	// Getter and Setter for the degree name attribute
	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	// toString method that returns the degree name
	@Override
	public String toString() {
		return "[degreeName=" + degreeName + "]";
	}

}
