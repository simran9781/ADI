public class RepeatedSubstringPattern {
    public static boolean repeat(String s)
    {
        String doub = s+s;
        return doub.substring(1,doub.length()-1).contains(s);
    }
    public static void main(String[] args) {
        System.out.println(repeat("abab"));
    }
}
