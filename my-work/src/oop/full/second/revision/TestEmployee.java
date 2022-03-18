package oop.full.second.revision;

public class TestEmployee {
	public static void main(String[] args) {
		FullTimeEmployee e1 = new FullTimeEmployee();
		FullTimeEmployee e2 = new FullTimeEmployee(2, "xxx", 2222, 17);
		FullTimeEmployee e3 = new FullTimeEmployee();
		FullTimeEmployee e4 = new FullTimeEmployee(2, "xxx", 2222, 17);
		
		e3.setId(3);
		e3.setName("yyy");
		e3.setVacation(5);
		e3.setSalary(98888);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e4) ? "EQUAL" : "NOT EQUAL");
	}
}
