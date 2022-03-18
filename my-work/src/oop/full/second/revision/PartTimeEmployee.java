package oop.full.second.revision;

public class PartTimeEmployee extends Employee {
	private int hours;
	
	public PartTimeEmployee() {
		super();
		hours = -4;
	}
	
	public PartTimeEmployee(int id, String name, double salary, int hours) {
		super(id, name, salary);
		setHours(hours);
	}
	
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + this.getId() + ", name=" + this.getName() + ", salary=" + this.getSalary() + ", hours=" + hours + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PartTimeEmployee) {
			PartTimeEmployee that = (PartTimeEmployee) obj;
			return this.getId() == that.getId();
		}
		return false;
	}
}
