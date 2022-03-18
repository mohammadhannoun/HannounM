package uml;

public class TestEmpDAO {
	public static void main(String[] args) {
		EmpDAO d1 = new EmpDAO();
		Employee e1 = new Employee(1, "Mohammad Hannoun", 1800);
		
		d1.insert(e1);
		
		e1.setSalary(2600);
		
		d1.update(e1);
	}
}
