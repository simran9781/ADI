public class problem53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;
    }
}
