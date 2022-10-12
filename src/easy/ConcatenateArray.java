package easy;

import java.util.Arrays;

public class ConcatenateArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		int[] ansArray = getConcatenation(array);
		System.out.println(Arrays.toString(ansArray));
	}

	public static int[] getConcatenation(int[] nums) {
		

    int[] ans = new int[nums.length*2];
    
    for(int i =0;i<nums.length;i++) {
    	ans[i]= nums[i];
    }
    for(int i = nums.length;i<ans.length;i++) {
    	ans[i]=nums[i-nums.length];
    }
	return ans;
    //The answer got submitted!
    
    }
}
