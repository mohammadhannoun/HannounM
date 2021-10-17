package recursion;

public class SumOfNumbers {
	public static int sumOfNumbers(int num) {
		if(num==0) {
			return num;
		}
		return sumOfNumbers(num-1)+num;
	}
	public static void main(String[] args) {
		int sum= sumOfNumbers(100);
		System.out.println(sum);
	}
}
