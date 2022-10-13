package easy;

public class FirstPalindromicStringInArray {

	public static void main(String[] args) {
		
		String[] array = {"abc","car","ada","racecar","cool"};
		String palin = firstPalindrome(array);
		System.out.println(palin);
		

	}
	
    public static String firstPalindrome(String[] words) {
    	StringBuffer revWord = null;
    	for(String word: words) {
    		revWord = new StringBuffer(word);
    		if(revWord.reverse().toString().equals(word)) {
    			return revWord.toString();
    		}
    		
    	}
		return "";
    }


}
