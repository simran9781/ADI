import java.util.HashMap;

public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,4,1};
        int target = 5;
        System.out.println(maxlen(arr,target));
    }
    public static int maxsubarray(int[] nums)
    {
        if(nums == null || nums.length==0)
        {
            return 0;
        }
        int currSum=0;
        int maxSum =Integer.MIN_VALUE;

        for(int num : nums)
        {
            currSum = Math.max(num,currSum+num);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    // public static int maxSubarray(int[] nums)
    // {
    //     int currSum=0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int num : nums)
    //     {
    //         currSum = Math.max(currSum+num,num);
    //         if(currSum<0)
    //         {
    //             currSum=0;
    //         }
    //         maxSum = Math.max(maxSum,currSum);
    //     }

    //     return maxSum;
    // }
    public static int maxlen(int[] nums,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int currSum = 0;
        int maxlen = 0;

        for(int i=0;i<nums.length;i++)
        {
            currSum += nums[i];
            if(currSum==target)
            {
                maxlen=i+1;
            }
            if(map.containsKey(currSum-target))
            {
                maxlen = Math.max(maxlen, i-map.get(currSum-target));
            }
            map.putIfAbsent(currSum, i);
        }
        return maxlen;
    }

}

