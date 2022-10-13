package easy;

public class RichestCustomer {

	public static void main(String[] args) {
		int[][] array = {{1,2,3},{3,2,1}};
		int ans = maximumWealth(array);
		System.out.println(ans);
	}

	public static int maximumWealth(int[][] accounts) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[0].length; j++) {
				sum += accounts[i][j];
			}
			max = Math.max(sum, max);
		}
		return max;
	}
}
