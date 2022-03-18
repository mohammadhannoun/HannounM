package section16;

import java.util.function.IntPredicate;

public class Class_194 {
	public static void main(String[] args) {
		IntPredicate moreThan10 = i->i>10;
		IntPredicate lessThan20 = i->i<20;
		Class_194 c1 = new Class_194();
		c1.prnt(15, moreThan10, lessThan20);
	} public void prnt(int value, IntPredicate moreThan10, IntPredicate lessThan20) {
		if(moreThan10.and(lessThan20).test(value)) System.out.println("Suitable Input!");
		else System.out.println("Invalid Input !!!");
	}
}
