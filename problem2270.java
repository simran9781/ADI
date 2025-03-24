public class problem2270 {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        long totalsum =0;
        for(int num : nums)
        {
            totalsum+=num;
        }
        long leftsum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            leftsum+=nums[i];
            long rightsum = totalsum-leftsum;

            if(leftsum>=rightsum)
            {
                ans++;
            }
        }
        return ans;
    }
}
