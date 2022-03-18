package prototype;

public class Emp implements Cloneable {

	private int id;
	private String name;
	private Address address;

	public Emp() {

	}

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Emp clone() throws CloneNotSupportedException {
		
		// Shallow Copy
		Emp emp = (Emp) super.clone();

		// Deep Copy
		emp.address = new Address(this.getAddress().getCountry(), this.getAddress().getCity(), this.getAddress().getMobile());

		return emp;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
