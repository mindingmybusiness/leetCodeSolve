package easy;

import java.util.Arrays;

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and 
 * nums[j] < nums[i]. 
 * Return the answer in an array.
 */


public class smallerNumbers {

	public static void main(String[] args) {
		
		int[] array = {6,5,4,8};
		int[] ansArray = smallerNumbersThanCurrent(array);
		System.out.println(Arrays.toString(ansArray));
 
	}
	
    public static int[] smallerNumbersThanCurrent(int[] nums) {
    	int[] smallerNums = new int[nums.length];
    	
    	for(int i=0;i<nums.length;i++) {
    		int add = 0;
    		int currentNum = nums[i];
    		for(int j=0;j<nums.length;j++) {
    			if(nums[j]<currentNum) {
    				add++;
    			}
    		}
    		smallerNums[i]=add;
    	}
    	return smallerNums;
    }


}
