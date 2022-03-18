package oop.full;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee(4, "Mohammad", 1000000);
		PartTimeEmployee e5 = new PartTimeEmployee();
		FullTimeEmployee e6 = new FullTimeEmployee();
		PartTimeEmployee e7 = new PartTimeEmployee(8, "Sami", 5000, 9);
		FullTimeEmployee e8 = new FullTimeEmployee(9, "Rashed", 3000, 35);
		
		e1.setId(1);
		e1.setName("Ahmad");
		e1.setSalary(960);
		
		e2.setId(1);
		e2.setName("Ahmad");
		e2.setSalary(960);
		
		e5.setId(5);
		e5.setName("Ali");
		e5.setSalary(2000);
		e5.setHour(6);
		
		e6.setId(6);
		e6.setName("Jamal");
		e6.setSalary(1500);
		e6.setVacation(30);
		
		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getSalary());
		System.out.println(e3.getId() + " " + e3.getName() + " " + e3.getSalary());
		System.out.println(e4.getId() + " " + e4.getName() + " " + e4.getSalary());
		//System.out.println(e5.getId() + " " + e5.getName() + " " + e5.getSalary() + " " + e5.getHour());
		System.out.println(e5);
		//System.out.println(e6.getId() + " " + e6.getName() + " " + e6.getSalary() + " " + e6.getVacation());
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(e4.toString());
		System.out.println(e2);
		System.out.println(e1);
		System.out.println(e3);
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(e1.equals(e2) ? "Equal" : "Not Equal");
		
		Employee[] e = new Employee[100];
			for (int i = 0; i < e.length; i++) {
				e[i] = new Employee();
			}
		System.out.println(e[0]);
	}
}
