package oop.full.second.revision;

public class FullTimeEmployee extends Employee {
	private int vacation;
	
	public FullTimeEmployee() {
		super();
		vacation = -3;
	}
	
	public FullTimeEmployee(int id, String name, double salary, int vacation) {
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
	public String toString() {
		return "Employee [id=" + this.getId() + ", name=" + this.getName() + ", salary=" + this.getSalary() + ", vacation=" + vacation + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof FullTimeEmployee) {
			FullTimeEmployee that = (FullTimeEmployee) obj;
			return this.getId() == that.getId();
		}
		return false;
	}
	
}
