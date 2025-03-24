public class problem214 {
    public int[] computelps(String t)
    {
        int[] lps = new int[t.length()];
        int i=1;
        int length=0;
        lps[0]=0;

        while(i<t.length())
        {
            if(t.charAt(i)==t.charAt(length))
            {
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0)
                {
                    length = lps[length-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public String shortestPalindrome(String s) {
        if(s.length()==0 || s==null)
        {
            return "";
        }

        String t = s+"#"+new StringBuilder(s).reverse().toString();

        int[] lps = computelps(t);

        int len = lps[t.length()-1];
        String rem = s.substring(len);

        return new StringBuilder(rem).reverse().toString()+s;
    }
}
