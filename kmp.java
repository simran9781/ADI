public class kmp {
    public static void computelps(String pattern,int[] lps)
    {
        int n = pattern.length();
        int length=0;
        lps[0] = 0; 
        int i=1;

        while(i<n)
        {
            if(pattern.charAt(i)==pattern.charAt(length))
            {
                length++;
                lps[i] = length;
                i++;
            }else{
                if(length!=0)
                {
                    length = lps[length-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
    }
    public static void kmp(String text,String pattern)
    {
        int m = text.length();
        int n = pattern.length();

        int[] lps = new int[n];

        computelps(pattern,lps);

        int i=0,j=0;
        while(i<m)
        {
            if(text.charAt(i)==pattern.charAt(j))
            {
                i++;
                j++;
            }

            if(j==n)
            {
                System.out.println(i-j);
                j = lps[j-1];
            }
            else if(i<m && text.charAt(i)!=pattern.charAt(j))
            {
                if(j!=0)
                {
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";

        kmp(text,pattern);
    }
}
