import java.util.ArrayList;
import java.util.List;

public class problem78 {
    public void find(int index,int[] nums,List<Integer> curr,List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        find(index+1,nums,curr,ans);

        int num = nums[index];
        curr.add(num);
        find(index+1,nums,curr,ans);
        curr.remove(curr.size()-1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int index =0;
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        find(index,nums,curr,ans);
        return ans;
    }
}
