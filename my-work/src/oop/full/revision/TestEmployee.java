package oop.full.revision;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "moh", 1);
		Employee e2 = new Employee(1, "moh", 1);
		Employee e3 = new Employee();
		Employee e4 = new Employee(4, "jasem", 500);
		PartTimeEmployee e5 = new PartTimeEmployee(6, "kk", 909, 99);
		PartTimeEmployee e6 = new PartTimeEmployee(6, "zoz", 900, 22);
		FullTimeEmployee e7 = new FullTimeEmployee();
		FullTimeEmployee e8 = new FullTimeEmployee(8, "rogo", 898, 35);
		
		e1.setId(1);
		e1.setName("Mohammad");
		e1.setSalary(100000);
		
		
		
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		
		System.out.println(e1.equals(e2));
		System.out.println(e5.equals(e6));
	}
}
