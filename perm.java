public class perm {
    public static void generate(String str,String p)
    {
        if(str.isEmpty())
        {
            System.out.println(p);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String rem = str.substring(0, i)+str.substring(i+1);
            generate(rem, p+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        generate(str, "");
    }
}
