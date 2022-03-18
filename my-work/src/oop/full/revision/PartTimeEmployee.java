package oop.full.revision;

public class PartTimeEmployee extends Employee {
	private int hour;
	
	public PartTimeEmployee() {
		super();
		hour = -1;
	}
	
	public PartTimeEmployee(int id, String name, double salary, int hour) {
		super(id, name, salary);
		setHour(hour);
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "Employee [id=" + this.getId() + ", name=" + this.getName() + ", salary=" + this.getSalary() + ", hour=" + hour + "]";
	}
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
		PartTimeEmployee that = (PartTimeEmployee) obj;
		return this.getId() == that.getId();
		}
		return false;
	}
}
