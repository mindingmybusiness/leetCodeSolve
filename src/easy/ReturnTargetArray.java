package easy;

public class ReturnTargetArray {
	
	/*
	 * Given two arrays of integers nums and index. Your task is to create target
	 * array under the following rules:
	 * 
	 * Initially target array is empty. From left to right read nums[i] and
	 * index[i], insert at index index[i] the value nums[i] in target array. Repeat
	 * the previous step until there are no elements to read in nums and index.
	 * Return the target array.
	 */

	public static void main(String[] args) {

	}
	
    public static int[] createTargetArray(int[] nums, int[] index) {
    	int[] ansArray = new int[index.length];
    	
    	for (int i=0;i< index.length;i++) {
    		int indexNum = index[i];
    		int num = nums[i];
    		ansArray[indexNum]=num;
    	}
    	
    	return ansArray;
    }


}
