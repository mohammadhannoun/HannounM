package oop.full;

public class PartTimeEmployee extends Employee{
	private int hour;
	
	public PartTimeEmployee() {
	}
	
	public PartTimeEmployee(int id, String name, int salary, int hour) {
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
	public String toString() { //Instead of printing each time, we can override the "toString" method !!
		return "PartTimeEmployee [id=" + getId() + ", name=" + getName() + ", salary=" + getSalary() +  ", Hours=" + hour + "]";
	}
	
}
