package medium;

public class AddEvenDigits {

	public static void main(String[] args) {
		int number = 129324;
		System.out.println(addEvenDigits(number));
	}

	public static int addEvenDigits(int num) {
		int sum =0;
		while(num!=0) {
			int temp = num %10;
			num = num/10;
			if(temp %2 == 0) {
				sum += temp;
			}
		}
		return sum;
		
	}
}
