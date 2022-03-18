package oop.full;

public class FullTimeEmployee extends Employee{
	private int vacation;
	
	public FullTimeEmployee() {
		
	}
	
	public FullTimeEmployee(int id, String name, int salary, int vacation) {
		super(id, name, salary);
		setVacation(vacation);
	}
	
	public int getVacation() {
		return vacation;
	}
	
	public void setVacation(int vacation) {
		this.vacation = vacation;
	}
	
	@Override
	public String toString() { //Instead of printing each time, we can override the "toString" method !!
		return "FullTimeEmployee [id=" + getId() + ", name=" + getName() + ", salary=" + getSalary() +  ", vacation=" + vacation + "]";
	}
}
