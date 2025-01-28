public class MinAvDiff {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int res =0;
        long min =Long.MAX_VALUE;
        long leftsum =0;
        long rightsum=0;
        long sum =0;

        for(int num : nums)
        {
            sum+=num;
        }

        for(int i=0;i<n;i++)
        {
            leftsum+=nums[i];
            rightsum = sum-leftsum;
            long left = leftsum/(i+1);
            long right = (i==n-1)?0:rightsum/(n-i-1);
            long diff = Math.abs(left-right);

            if(diff<min)
            {
                min = diff;
                res =i;
            }
        }

        return res;
    }
}
