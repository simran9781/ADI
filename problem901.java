import java.util.Stack;

public class problem901 {
      class Pair{
        int price;
        int span;
        Pair(int price,int span)
        {
            this.price = price;
            this.span = span;
        }
    }
    public Stack<Pair> s = new Stack<>();
    int index=-1;
    public StockSpanner() {
        index=-1;
        s.clear();
    }
    
    public int next(int price) {
        index=index+1;

        while(!s.isEmpty() && s.peek().price<=price){
            s.pop();
        }
           int ans = index-(s.isEmpty()?-1:s.peek().span);
            s.push(new Pair(price,index));
        
        return ans;
    }
}
