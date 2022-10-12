package easy;

public class Operations {

	public static void main(String[] args) {
		String[] array = { "--X", "X++", "X++" };
		int ansArray = finalValueAfterOperations(array);
		System.out.println(ansArray);

	}

	public static int finalValueAfterOperations(String[] operations) {
		int value = 0;

		for (int i = 0; i < operations.length; i++) {
			if (operations[i].charAt(1)=='+') {
				value++;
			}else {
				value--;
			}
		}
  
		return value;
	}

}
