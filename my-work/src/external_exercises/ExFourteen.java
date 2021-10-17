package external_exercises;

public class ExFourteen {
	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=45; j++) {
				if(j>=1&&j<=6&&i%2!=0&&i<=7) {
					System.out.print("* ");
				}
				else if(j>=1&&j<=5&&i%2==0&&i<=6) {
					System.out.print(" *");
				}
				else if((j==6||j==7)&&i<=6&&i%2==0) {
					System.out.print(" ");
				}
				else if(j>12) {
					System.out.print("=");
				}
				else if(i>7) {
					System.out.print("=");
				}
			}
			System.out.println("");
		}
	}
}
