package easy;

public class LongestPrefix {
	
	public static void main(String[] args) {
		String[] strs = { "Flower","Float","Floor"};
		System.out.println(longestPrefix(strs));
		
	}
	
	public static String longestPrefix(String[] strs) {
		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

}
