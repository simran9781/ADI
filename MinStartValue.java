public class MinStartValue {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int prefixsum = 0;
        int min = 0;

        for(int i=0;i<n;i++)
        {
            prefixsum+=nums[i];
            min = Math.min(prefixsum,min);
        }

        return 1-min;
    }
}
