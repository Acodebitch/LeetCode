package leetcode;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
	    char[] ch = s.toCharArray();
	    int max=0;
	    int curr=0;
	    for (int i=0;i<ch.length;i++){
	        curr++;
	        if (map.containsKey(ch[i])){
	            curr =Math.min(curr, i-map.get(ch[i]));
	        }
	        map.put(ch[i],i);
	        if (curr>max) max = curr;

	    }
	    return max;
}
}
