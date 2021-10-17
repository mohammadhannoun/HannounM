package external_exercises;

public class ExFifty {
	public static void main(String[] args) { 
		System.out.print("Numbers divisible by 3 : ");
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i+" , ");
			}
			if(i==50) {
				System.out.println(" ");
			}
		}
		System.out.println(" ");
		System.out.print("Numbers divisible by 5 : ");
		for(int j=1; j<=100; j++) {
			if(j%5==0) {
				System.out.print(j+" , ");
			}
			if(j==50) {
				System.out.println(" ");
			}
		}
		System.out.println(" ");
		System.out.print("Numbers divisible by 3 & 5 : ");
		for(int k=1; k<=100; k++) {
			if(k%5==0&&k%3==0) {
				System.out.print(k+" , ");
			}
			if(k==50) {
				System.out.println(" ");
			}
		}
	}
}
