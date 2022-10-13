package easy;

public class MaxNumOfWords {

	public static void main(String[] args) {
		String[] array = {"please wait", "continue to fight", "continue to win"};
		int answer = mostWordsFound(array);
		System.out.println(answer);
	}
	
    public static int mostWordsFound(String[] sentences) {
    	int ans =0;
    	
    	for(String sentence: sentences) {
    		String[] words = sentence.split(" ");
    		if(ans<words.length) {
    			ans = words.length;
    		}
    	}
    	return ans;
    }


}
