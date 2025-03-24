import java.util.*;
public class test {
    public static int find(int[] arr,int n){
        int ans =0;
        int freq = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>freq){
                freq = m.getValue();
                ans = m.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.println(find(arr,n));
    }
}
