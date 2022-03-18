package oop.full.revision;

public class Employee {
	//Simple
	private int id = -1;
	private String name = "Please Enter Your Name !";
	private double salary = -1;
		public Employee() {
			id = -2;
			name = "Fill the name section";
			salary = -3;
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
