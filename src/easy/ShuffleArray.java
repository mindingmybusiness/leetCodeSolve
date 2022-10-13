package easy;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] array = {2,5,1,3,4,7};
		int n = 3;
		int[] ansArray = shuffle(array,n);
		System.out.println(Arrays.toString(ansArray));
	}
	
    public static int[] shuffle(int[] nums, int n) {
    	int[] ans = new int[2*n];
    
    	for(int i=0;i<n;i++) {
    		ans[2*i]=nums[i];
    		ans[2*i+1]=nums[i+n];
    	}
    	return ans;
    }


}
