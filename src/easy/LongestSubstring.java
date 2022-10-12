package easy;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		char[] stringConv = s.toCharArray();
		int count =0;
		for(int i=0;i<stringConv.length-1;i++) {
			if(stringConv[i] != stringConv[i+1]) {
				count++;
			}else {
				count =0;
			}
		}
		
		
		return count;
		
	}
}
