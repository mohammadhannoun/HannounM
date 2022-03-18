package oop.full.second.revision;
import java.util.Vector;
import java.util.ArrayList;
public class VctorAndArrList {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		Vector<Object> v2 = new Vector<Object>();
		
		v1.add("Hello");
		v1.add("It's Me");
		
		v2.add(1);
		v2.add(5.56);
		v2.add(v1);
		v2.add("Hi");
		
		System.out.println(((Vector)v2.elementAt(2)).elementAt(0));
		
		ArrayList<String> small = new ArrayList<String>();
		small.add("Mohmmad Hannoun");
		small.add("Jordanian");
		
		ArrayList<Object> large = new ArrayList<Object>();
		large.add(555);
		large.add(5.366555);
		large.add("jefid");
		large.add(small);
		
		System.out.println(((ArrayList)large.get(3)).get(1));
	}
}
