package oop.neo;

public class StudentImp {
	public static void main(String[] args) {
		Student std = new Student("Mohmmad", 18, "Amman");
		System.out.println(std.getAge());
		System.out.println(std.getAddress());
		System.out.println(std.getName());
		std.setName("Yousef");
		System.out.println(std.getName());
	}
}
