package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*You are given an array of strings names, and an array heights that consists of distinct positive integers.
Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
*/

public class SortPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }        
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }

}
