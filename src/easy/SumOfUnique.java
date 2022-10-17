package easy;

import java.util.ArrayList;

public class SumOfUnique {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		System.out.println(sumOfUnique(nums));
	}

	public static int sumOfUnique(int[] nums) {
    	int[] unique = new int[nums.length];
    	int ans =0;
    	
    	for(int i =0;i< nums.length;i++) {
    		for(int j=0;j<nums.length;j++) {
    	    	if(nums[i]!= nums[j]) {
    	    		unique[i]=nums[j];
    		}	
    	}
    	}
    	for(int i=0;i<unique.length;i++) {
			ans= ans+ unique[i];
		}
		return ans;
	}	
}
