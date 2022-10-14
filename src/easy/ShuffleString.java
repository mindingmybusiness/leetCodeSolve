package easy;

public class ShuffleString {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,1,2,3};
		String ans = restoreString(s, indices);
		System.out.println(ans);
	}

public static String restoreString(String s, int[] indices) {
        
        char[] str= s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
           str[indices[i]]=s.charAt(i);
            
        }
        
        return String.valueOf(str);
    }
}
