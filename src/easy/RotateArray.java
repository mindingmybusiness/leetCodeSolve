//This is a medium problem
package easy;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,6,7};
		rotate(array,3);
	}

	// Given an array, rotate the array to the right by k steps, where k is
	// non-negative.

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		int[] array1 = Arrays.copyOf(nums, nums.length);

		for(int i=0; i<k;i++) {
			int length = len-k;
			array1[i]= nums[length+i];
		}
		
		for(int i=k;i<nums.length;i++) {
			array1[i]=nums[i-k];
		}
		
		System.out.println("The reversed array is: " + Arrays.toString(array1));

	}

}
