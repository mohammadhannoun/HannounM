package oop.full.revision;

public class TestGenerics {
	public static void main(String[] args) {
		GenericClass<Integer> g1 = new GenericClass<Integer>();
		GenericClass<String> g2 = new GenericClass<String>();
		GenericClass<Employee> g3 = new GenericClass<Employee>();
		Employee e1 = new Employee(1, "Moh", 2600);
		g1.setValue(55);
		g2.setValue("Hello World");
		g3.setValue(e1);
		
		System.out.println(g1.getValue());
		System.out.println(g2.getValue());
		System.out.println(g3.getValue());
	}
}
