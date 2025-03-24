import java.util.*;
public class problem340 {
    public static int lengthofSubstring(String s,int k){
        if(s==null || s.length()==0 || k==0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int maxlen=0,left=0;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "eceba";
        System.out.println(lengthofSubstring(s, 2));
    }
}
