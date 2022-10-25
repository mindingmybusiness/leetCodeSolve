
public class start {

	/*
	 * Given two string arrays word1 and word2, return true if the two arrays
	 * represent the same string, and false otherwise.
	 * 
	 * A string is represented by an array if the array elements concatenated in
	 * order forms the string.
	 */
	public static void main(String[] args) {
		String[] word1= {"ab", "cd"};
		String[] word2 = {"a", "bcd"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    	String wordLetters1 = "";
    	String wordLetters2 = "";
    	for(String wordLetters: word1) {
        	wordLetters1 = wordLetters1 + wordLetters;
    	}
    	for(String wordLetters:word2) {
        	wordLetters2 = wordLetters2 + wordLetters;
    	}    
    	
    	if(wordLetters1.equals(wordLetters2)) {
    		return true;
    	}else {
    		return false;
    	}
    }


}
