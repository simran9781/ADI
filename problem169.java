public class problem169{
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=-1;
 
        for(int i=0;i<nums.length;i++)
        {
         if(count==0)
         {
             count=1;
             ele = nums[i];
         }
         else if(ele==nums[i])
         {
             count++;
         }
         else
         {
             count--;
         }
        }
 
        int c =0;
        for(int i=0;i<nums.length;i++)
        {
         if(ele == nums[i])
         {
             c++;
         }
        }
 
        if(c>nums.length/2)
        {
         return ele;
        }
        else
        {
         return -1;
        }
     }
}