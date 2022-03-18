package oop.full;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector<String> vSmall = new Vector<String>();
		Vector<Object> vLarge = new Vector<Object>();
		
		vSmall.add("Mohmmad");
		vSmall.add("Hannoun");
		
		vLarge.add(1);
		vLarge.add(vSmall);
		vLarge.add(2600.99);
		
		System.out.println(vLarge);
		
		vLarge.insertElementAt("CS", 2);
		
		System.out.println(vLarge);
		
		System.out.println(((Vector) vLarge.elementAt(1)).elementAt(1));
		
		Vector<Employee> v = new Vector<Employee>();
		Employee e1 = new Employee(1, "Nid", 800);
		
		v.add(e1);
		System.out.println(v);
	}
}
