package easy;

import java.util.Arrays;

public class TruncateString {

	/*
	 * You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate
	 * s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​
	 * after truncating it.
	 */
	
	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(truncateSentence(s,k));
	}
	
    public static String truncateSentence(String s, int k) {
    	String[] str = s.split(" ");
    	System.out.println(Arrays.toString(str));
    	String[] ans = new String[k];
    	for(int i=0;i<k;i++) {
    		ans[i]= str[i];
    	}
    	
    	String str1="";
        for(int i=0;i<k;i++){
            str1=str1+ans[i];
            if(i!=k-1){
                str1=str1+" ";
            }
        }
    	return str1;
    }


}
