package section16;

interface Lambda{
	public void demo();
}

public class Class_188 {
	public static void main(String[] args) {
		Lambda lam = (()-> System.out.println("Print Me"));
		lam.demo();
	
	}
}
