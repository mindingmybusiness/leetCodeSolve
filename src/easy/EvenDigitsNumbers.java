package easy;

public class EvenDigitsNumbers {
	
	/*
	 * Given an array nums of integers, return how many of them contain an even
	 * number of digits.
	 */



	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
	
    public static int findNumbers(int[] nums) {
    	int digits;
    	int ans = 0;
    	for(int i=0;i<nums.length;i++) {
    		digits=0;
    		while(nums[i]!=0) {
    			nums[i] = nums[i]/10;
    			digits++;
    		}
    		if(digits%2==0) {
    			ans++;
    		}
    	}
    	return ans;
    }


}
