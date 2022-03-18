package uml;

public class TestAssociation {
	public static void main(String[] args) {
		Department d1 = new Department("Human Resources");
		Employee e1 = new Employee(1, "Mohammad Hannoun", 3500);
		
		System.out.println(e1.getName() + " works at the " + d1.getName() + " Department.");
	}
}
