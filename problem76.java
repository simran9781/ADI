import java.util.HashMap;

public class problem76{
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int index=-1;
        int minlen = 1000000000;
        int m = t.length();
        int n = s.length();
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<n){
            char chright = s.charAt(r);
            if(map.containsKey(chright))
            {
                map.put(chright,map.get(chright)-1);
                if(map.get(chright)>=0)
                {
                    count++;
                }
            }

            while(m==count){
                if(r-l+1<minlen)
                {
                    minlen = r-l+1;
                    index=l;
                }
                char chleft = s.charAt(l);

                if(map.containsKey(chleft))
                {
                    map.put(chleft,map.get(chleft)+1);
                    if(map.get(chleft)>0)
                    {
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        return index==-1?"":s.substring(index,index+minlen);
    }
}