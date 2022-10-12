package easy;

import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {
		int[] array = {1,2,34,10};
		int[] ansArray = runningSum(array);
		System.out.println(Arrays.toString(ansArray));
	}
	
    public static int[] runningSum(int[] nums) {
    	int[] ans = new int[nums.length];
    	ans[0]=nums[0];    
    	for(int i=1; i<nums.length;i++) {
    		ans[i]= ans[i-1]+ nums[i];
    	}
    	
    	return ans;
    	
    }
    

}
