import java.util.*;
public class BcktrackIntro {
    //What is BackTracking:
    //Backtracking is a technique used to expore all possible solutions.
    //by trying out different choices  and undoing when choice leads to a dead end



    // You have to choose the possibilities.

    // recursion approach to explore further

    // if the condition met,store the result

    // if the choice does not lead to solution,undo the last choice(backtrack)

    public static void gs(int[] nums,int in,List<Integer> curr,List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));

        for(int i=in;i<nums.length;i++)
        {
            curr.add(nums[i]);
            gs(nums,in+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> res = new ArrayList<>();
        gs(nums,0,new ArrayList<>(),res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

}
