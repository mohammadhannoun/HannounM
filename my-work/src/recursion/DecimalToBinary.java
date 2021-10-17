package recursion;

public class DecimalToBinary {
	public static String dToB(int num, String result) {
		if(num==0) {
			return result;
		}
		result = num%2+result;
		return dToB(num/2, result);		
	}
	public static void main(String[] args) {
		String binary= dToB(233, "");
		System.out.println(binary);
	}
}
