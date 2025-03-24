import java.util.HashSet;
import java.util.Set;

public class problem3{
    public static int lengthoflongestsubstring(String s){
        Set<Character> set = new HashSet<>();
        int left=0,maxlen=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        System.out.println(lengthoflongestsubstring("abcabcbb"));
    }
}