public class problem35 {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans =-1;
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }
        while(low<=high)
        {
            int mid = (low + high) / 2;
            if(nums[mid]>=target)
            {
                ans = mid;
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        
        return ans;
    }
}
