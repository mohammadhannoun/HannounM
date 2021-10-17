package external_exercises;
import java.util.Arrays;
import java.util.Scanner;
public class ExNinetyFour {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length= in.nextInt();
		int[] arr= new int[length];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+" : ");
			arr[i]= in.nextInt();
		}
		int od= 0;
		int ev= 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]%2==0) {
					ev++;
				}
				else {
					od++;
				}
			}
			int[] odd= new int[od];
			int[] even= new int[ev];
			int ccc=0;
			for(int k=0; k<arr.length; k++) {
				if(arr[k]%2==0) {
					even[ccc]=arr[k];
					ccc++;
				}
			}
			int cc= 0;
			for(int u=0; u<arr.length; u++) {
				if(arr[u]%2!=0) {
					odd[cc]=arr[u];
					cc++;
					}
			}
			int c= 0;
			for(int ii=0; ii<arr.length; ii++) {
				if(ii>=0&&ii<odd.length) {
					arr[ii]=odd[ii];
						}
				else if(ii>=odd.length&&ii<arr.length){
					arr[ii]=even[c];
					c++;
				}
			}
			
		System.out.println("New array : "+Arrays.toString(arr));
		in.close();
	}
}
