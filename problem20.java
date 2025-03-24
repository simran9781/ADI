import java.util.Stack;

public class problem20 {
     public boolean isValid(String s) {
        if(s.length()%2!=0)
        {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }

                char ch = st.pop();

                if((ch!='{' && s.charAt(i)=='}') || (ch!='[' && s.charAt(i)==']') || (ch!='(' && s.charAt(i)==')'))
                {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
