import java.util.HashMap;
import java.util.Stack;

public class problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && nums2[i]>s.peek())
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                map.put(nums2[i],-1);
            }
            else
            {
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
