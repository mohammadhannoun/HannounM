package oop.full.second.revision;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		id = -1;
		name = "Insert Your Name!";
		salary = -2;
	}
	
	public Employee(int id, String name, double salary) {
		setId(id);
		setName(name);
		setSalary(salary);
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
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee that = (Employee) obj;
			return this.id == that.id;
		}
		return false;
	}
}
