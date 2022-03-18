package uml;

public class TestAddEmp {
	public static void main(String[] args) {
		Address a1 = new Address("Amman", "Jordan", "0798981260");
		Employee e1 = new Employee(1, "Mohammad", 1800, a1);
		
		System.out.println(e1.toString());
	}
}
