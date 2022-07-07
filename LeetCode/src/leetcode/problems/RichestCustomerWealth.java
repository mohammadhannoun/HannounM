package leetcode.problems;

public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][] accounts = {
				{1, 2, 3},
				{3, 2, 1}
		};
		System.out.println(maximumWealth(accounts));
	}
	public static int maximumWealth(int[][] accounts) {
		int temp, wealth;
		temp = wealth = 0;
		for(int i = 0; i < accounts.length; i++) {
			temp = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				temp += accounts[i][j];
			}
			if(i == 0 || (temp > wealth)) {
				wealth = temp;
			}
		}
			return wealth;
	}
}
