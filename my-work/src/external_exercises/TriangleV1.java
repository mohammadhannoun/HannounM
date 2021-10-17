package external_exercises;

import java.util.Scanner;

public class TriangleV1 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of stars : ");
		int x = scan.nextInt();
		char[][] arr = new char[x][x];
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < x; j++) {
					arr[i][j] = '*';
				}
			}
			int cntr = x-1;
			for(int k = 0; k < x; k++) {
				for(int u = 0; u < x; u++) {
					if(u>=cntr) {
					System.out.print(arr[k][u]);
						}
					else {
						System.out.print(" ");
					}
					}
				cntr--;
				System.out.println();
			}
	}
}
