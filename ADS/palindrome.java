public class palindrome {
    public static boolean ispalindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str= "aba";
        if(ispalindrome(str))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}