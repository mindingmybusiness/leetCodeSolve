package medium;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "This is a fresh start";
		System.out.println(reverseStringWords(str));
	}

	public static String reverseStringWords(String str) {
		String ans = "";
		String[] words = str.split(" ");
		
		for(String str1: words) {
			if(str1.trim().isEmpty()) {
				continue;
			}
			ans = str1 + " " + ans;
		}
		return ans.trim();
	}
}
