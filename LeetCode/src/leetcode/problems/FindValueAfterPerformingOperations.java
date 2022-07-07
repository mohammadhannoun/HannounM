package leetcode.problems;

public class FindValueAfterPerformingOperations {
	public static void main(String[] args) {
		String[] operations = {"--X","X++","X++"};
		int X = finalValueAfterOperations(operations);
		System.out.println(X);
	}
	public static int finalValueAfterOperations(String[] operations) {
		int X = 0; 
			for(int i = 0; i < operations.length; i++) {
				X += operations[i].equals("X++") || operations[i].equals("++X") ? 1 : -1;
			}
			return X;
	}
}
