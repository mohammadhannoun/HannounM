package uml;

public class Employee {
	private int  id = 999;
	private String name = "Enter your name !";
	private double salary = 400;
	private Address address;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary) {
		setId(id);
		setName(name);
		setSalary(salary);
	}
	
	public Employee(int id, String name, int salary, Address address) {
		setId(id);
		setName(name);
		setSalary(salary);
		setAddress(address);
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() { 
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", " + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee){
			Employee that = (Employee) obj;
			return this.id == that.id;
		}
		else {
			return false;
		}
	}
	
}
