import java.util.HashMap;

public class Stringmanipulation {
    public static String minwindow(String s1,String s2)
    {
        if(s1==null || s2==null || s1.length()<s2.length())
        {
            return "";
        }

        HashMap<Character,Integer> charfreq = new HashMap<>();
        for(char c : s2.toCharArray())
        {
            charfreq.put(c,charfreq.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> windowCoun = new HashMap<>();
        int start=0;
        int matched =0;
        int min = Integer.MAX_VALUE;
        int minStart = 0;

        for(int end = 0;end <s1.length();end++)
        {
            char endchar = s1.charAt(end);
            windowCoun.put(endchar,windowCoun.getOrDefault(endchar, 0)+1);

            if(charfreq.containsKey(endchar) && windowCoun.get(endchar).equals(charfreq.get(endchar)))
            {
                matched++;
            }

            while(matched==charfreq.size())
            {
                if(end-start+1<min)
                {
                    min = end-start+1;
                    minStart = start;
                }
                char startchar = s1.charAt((start));
                windowCoun.put(startchar,windowCoun.get(startchar)-1);

                if(charfreq.containsKey((startchar)) && windowCoun.get(startchar)<charfreq.get(startchar))
                {
                    matched--;
                }
                start++;
            }
        }

        return min == Integer.MAX_VALUE?"":s1.substring(minStart, minStart+min);
    }
    public static void main(String[] args) {
        //Find the smallest substrubg in the first string that contains all characters of the second string?

        //we  are going to use 2 hashmaps
        // charfreq : to store the freq of each character in s2
        // windowcoun : to store the frequency of characters in the current window of s1

        //use 2 pointers: start and end to denote the current window

        //Expand the window bymoving the end pointer until all characters in s2 covered.

        //Once a valid windrow is found , shrink it from the left by moving to minimize the window size

        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
        String ans = minwindow(s1, s2);
        System.out.println(ans);
    }
}