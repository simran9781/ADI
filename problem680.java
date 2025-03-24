public class problem680 {
    private boolean palindrome(String s,int st,int e)
    {
        while(st<e)
        {
             if(s.charAt(st)!=s.charAt(e))
             {
                return false;
             }
             st++;
             e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int start=0;
        int count=0;
        int end = s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return (palindrome(s,start+1,end) || palindrome(s,start,end-1));
            }
            start++;
            end--;
        }
        
        return true;
    }
}
