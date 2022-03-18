package oop.full.revision;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Mohmmad Hannoun", 8000);
		Employee e2 = new Employee(2, "xxxxxxxxxx", 1);
		
		Vector<Employee> vEmp = new Vector<Employee>();
		
		vEmp.add(e1);
		vEmp.add(e2);
		
		
	}
}
