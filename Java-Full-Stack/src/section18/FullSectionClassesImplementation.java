package section18;

public class FullSectionClassesImplementation {
	public static void main(String[] args) {
		int cntr = 0;
		int x = 5;
		cntr = increaseMe(cntr);
		x += 6;
		System.out.println(cntr+x);
	} public static int increaseMe(int var) {
		return (var+10);
	}
}
