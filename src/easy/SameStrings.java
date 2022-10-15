package easy;

public class SameStrings {

	/*
	 * Given two string arrays word1 and word2, return true if the two arrays
	 * represent the same string, and false otherwise. A string is represented by an
	 * array if the array elements concatenated in order forms the string.
	 */
	
	public static void main(String[] args) {
		String[] str1 = {"ab", "c"};
		String[] str2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(str1, str2));
	}
	
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    	String word1letters = "";
    	String word2letters = "";
    	for(String s:word1) {
    		word1letters=word1letters+s;
    	}
    	for(String s:word2) {
    		word2letters=word2letters+s;
    	}    
    	return word1letters.equals(word2letters);
    	
    }

}
