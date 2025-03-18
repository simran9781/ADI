import java.util.HashMap;
import java.util.Map;

public class problem159 {
    	public static int lengthOfLongestSubstring(String s) {
		int left=0;
		int maxlen=0;
		Map<Character,Integer> set = new HashMap<>();
		for(int right=0;right<s.length();right++){
			while(set.size()>2){
				set.put(s.charAt(left),set.get(s.charAt(left))-1);
				if(set.get(s.charAt(left))==0)
				{
					set.remove(s.charAt(left));
				}
				left++;
			}
			set.put(s.charAt(right),set.getOrDefault(s.charAt(right),0)+1);
			if(set.size()<=2){
			maxlen = Math.max(maxlen,right-left+1);
			}
		}
		return maxlen;
	}
}
