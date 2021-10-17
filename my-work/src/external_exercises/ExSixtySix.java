package external_exercises;

public class ExSixtySix {
	public static void main(String[] args) {
		int numbers= 1;
		int numbersV2= 1;
		int factors= 0;
		int sum= 0;
		int num= 0;
		do {
			for(int i=1; i<=numbersV2; i++) {
				if(numbersV2%i==0) {
					factors++;
					num =i;
				}
			}
			if(factors==2&&factors!=1) {
				sum +=num;
				numbers++;
			}
			numbersV2++;
			factors=0;
		}while(numbers<=100);
		System.out.println("The sum of the first 100 numbers = "+sum);
	}
}
