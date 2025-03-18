import java.util.HashMap;
import java.util.Map;

public class problem560{
    public static int subarraysum(int[] nums,int k){
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int sum=0,co=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey((sum-k))){
                co+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return co;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1};
        System.out.println(subarraysum(nums, 2));
    }
}