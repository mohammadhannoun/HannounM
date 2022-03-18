package oop.full;

public class TestGeneric {
	public static void main(String[] args) {
		GenericClass<String> g1 = new GenericClass<String>();
		GenericClass<Integer> g2 = new GenericClass<Integer>();
		GenericClass<Employee> g3 = new GenericClass<Employee>();
		
		g1.setValue("Hello");
		g2.setValue(250); 
		g3.setValue(new Employee(1, "xxx", 2500));
		
		System.out.println("g1 " + g1.getValue());
		System.out.println("g2 " + g2.getValue());
		System.out.println("g3 " + g3.getValue());
	}
}
