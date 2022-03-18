package prototype;

public class TestEmp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Jordan", "Amman", "07xxxxxxxx");
		
		Emp e1 = new Emp(1, "Hamzeh", address);
		Emp e2 = e1.clone();

		System.out.println("Employee 1: " + e1);
		System.out.println("Employee 2: " + e2);
		
		e2.getAddress().setCity("Irbid");
		
		System.out.println("Employee 1: " + e1);
		System.out.println("Employee 2: " + e2);

	}

}
