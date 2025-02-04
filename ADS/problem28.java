public class problem28 {
    public boolean compare(String haystack,String needle,int index)
    {
        for(int i=index,j=0;i<haystack.length() && j<needle.length();i++,j++)
        {
            if(haystack.charAt(i)!=needle.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
       int n1 = haystack.length();
       for(int i=0;i<n1;i++)
       {
        if(haystack.charAt(i)==needle.charAt(0))
        {
            if(compare(haystack,needle,i))
            {
                return i;
            }
        }
    }
    return -1;
    }
}
