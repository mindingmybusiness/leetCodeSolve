package easy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] array1 = Arrays.copyOf(array, array.length);
		array1[0]=10;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array));
	}

}
