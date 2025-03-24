import java.util.Stack;

public class InfixtoPrefix {
    public static int priority(char ch)
    {
        if(ch=='^')
        {
            return 3;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        else if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
    public static String prefix(String s)
    {
        StringBuilder str = new StringBuilder(s).reverse();
        int i=0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        while(i<str.length())
        {
            char ch = str.charAt(i);
            if (ch == '(') {
                ch = ')';
            } else if (ch == ')') {
                ch = '(';
            }
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop(); // Remove '('
                }
            } else { // Operator case
                while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty())
        {
            ans.append(st.peek());
            st.pop();
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(prefix(s));

    }
}
