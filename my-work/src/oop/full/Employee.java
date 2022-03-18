package oop.full;

public class Employee {
	private int  id = 999;
	private String name = "Enter your name !";
	private double salary = 400;
	//First Constructor
	public Employee() {
		this.id = 999999;
		this.name = "????";
		this.salary = 99999;
	}
	//Second Constructor
	public Employee(int id, String name, int salary) {
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

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() { //Instead of printing each time, we can override the "toString" method !!
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
