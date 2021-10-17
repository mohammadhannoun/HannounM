package external_exercises;

public class ExFiftySeven {
	public static void main(String[] args) {
		int number= ExFiftyTwo.getNumber("");
		int coll= 0;
		for(int i=1; i<=number; i++) { //The highest factor will be the number itself 
			if(number%i==0) {
				coll++;
			}
		}
		System.out.println(coll);
	}
}
