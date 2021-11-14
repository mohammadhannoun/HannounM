package reference.ths;

public class InvokingCurrentClassConstructor {
	String name;
	int age;
	InvokingCurrentClassConstructor(){
		this("Hello", 25);
		System.out.println("Default Constructor ! ");
	}
	InvokingCurrentClassConstructor(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Parameterized Constructor ! ");
	}
	InvokingCurrentClassConstructor get() {
		return this;
	}
	public static void main(String[] args) {
		InvokingCurrentClassConstructor test = new InvokingCurrentClassConstructor();
		System.out.println(test.get());
		
	}
}
