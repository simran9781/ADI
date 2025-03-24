import java.util.Arrays;

public class problem16 {
     public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetsum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int currsum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currsum)<Math.abs(target-closetsum))
                {
                    closetsum = currsum;
                }
                if(currsum<target)
                {
                    left++;
                }else if(currsum>target){
                    right--;
                }
                else
                {
                    return currsum;
                }
            }
        }

        return closetsum;
    }
}
