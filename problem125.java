public class problem125 {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                str.append(Character.toLowerCase(ch));
            }
        }

        int st =0;
        int e = str.length()-1;
        while(st<=e){
            if(str.charAt(st)!=str.charAt(e))
            {
                return false;
            }
            st++;
            e--;
        }
        return true;

    }
}
