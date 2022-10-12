package easy;

import java.util.Arrays;

public class PermutationBuild {

	public static void main(String[] args) {
		int[] array = {0,2,1,5,3,4};
		int[] ansArray = buildArray(array);
		System.out.println(Arrays.toString(ansArray));
	}

    public static int[] buildArray(int[] nums) {
    	int[] ans = new int[nums.length];
    	
    	for(int i=0; i< nums.length;i++) {
    		ans[i]= nums[nums[i]];
    	}
    	
    	return ans;
    }

}
