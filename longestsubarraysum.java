import java.util.HashMap;
import java.util.Map;

public class longestsubarraysum {
    public static int find(int[] arr, int k) {
        int maxlen=0;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
            if(sum==k)
            {
                maxlen = Math.max(maxlen,i+1);
            }
            
            int rem = sum-k;
            
            if(map.containsKey(rem))
            {
                int len = i-map.get(rem);
                maxlen = Math.max(len,maxlen);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        
        return maxlen;
    }

    public static String minwindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int right =0;
        int m = t.length();
        int n = s.length();
        int count =0;
        int index=-1;
        int minlen = 1000000000;

        for(int i=0;i<m;i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        while(right<s.length())
        {
            char r = s.charAt(right);
            if(map.containsKey(r))
            {
                map.put(r,map.get(r)-1);
                if(map.get(r)>=0)
                {
                    count++;
                }
            }

            while(count==m)
            {
                if(right-left+1<minlen)
                {
                    minlen = right-left+1;
                    index=left;
                }

                char l = s.charAt(left);
                if(map.containsKey(l))
                {
                    map.put(l,map.get(l)+1);
                    if(map.get(l)>0)
                    {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }

        return (index==-1)?"":s.substring(index,index+minlen);
    }
        public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,5,-1};
        int k = 5;
        System.out.println(find(arr,k));
        String s = "adobecodebanc";
        String t = "abc";
        System.out.println(minwindow(s, t));
    }

    
    //1. B.O(n)
    //2. A.O(n)
    //3. D. Using a hashmap
    //4. A.Merge Sort

    //Fill in the blanks
    //1.O(mn)
    //2.O(mn)
}
