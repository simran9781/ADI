import java.util.*;

public class minstack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public minstack(int val)
    {
        stack = new Stack<>();
        minstack= new Stack<>();
    }

    public void push(int val)
    {
        stack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek())
        {
            minstack.push(val);
        }
        else{
            minstack.push(minstack.peek());
        }
    }

    public void pop()
    {
        if(!stack.isEmpty())
        {
            stack.pop();
            minstack.pop();
        }
    }
    public int top()
    {
        return stack.peek();
    }
    public int getmin()
    {
        return minstack.peek();
    }
    
    public static void main(String[] args) {
        minstack l = new minstack(0);
        l.push(-2);
        l.push(0);
        l.push(-3);
        System.out.println(l.getmin());
        l.pop();
        System.out.println(l.top());
        System.out.println(l.getmin());
    }
}
