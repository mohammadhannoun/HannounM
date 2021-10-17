package external_exercises;

import java.util.Scanner;

public class ExNinetyThree {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= in.nextInt();
		int[] arr= new int[len];
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter the element number "+(i+1)+" : ");
				arr[i]= in.nextInt();
			}
			int x= 0;
			int y= 0;
			for(int j=1; j<arr.length; j++) {
				if(arr[j]==10) {
					if(arr[j-1]==10) {
						x++;
					}
				}
			    if(arr[j]==20) {
					if(arr[j-1]==20) {
						y++;
					}
				}
			}
			System.out.println(x+", "+y);
			if(x>0&&y>0) {
				System.out.println("False");
			}
			else if((x>0||y>0)){
				System.out.println("True");
			}
			
				in.close();
	}		
}

