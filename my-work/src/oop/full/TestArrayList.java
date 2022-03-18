package oop.full;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<Object> l2 = new ArrayList<Object>();
		l1.add("Mohmmad");
		l1.add("Hannoun");
		
		l2.add(1);
		l2.add(l1);
		l2.add(8000);
		
		System.out.println(((ArrayList)l2.get(1)).get(1));
	}
}
