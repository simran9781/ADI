public class ValidSplits {
    public static int validspilts(int[] arr)
    {
        int ans = 0;
        int totalsum =0;
        for(int num : arr)
        {
            totalsum+=num;
        }
        int leftsum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            leftsum+=arr[i];
            int rightsum = totalsum-leftsum;

            if(leftsum>=rightsum)
            {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,-8,7};
        int ans =validspilts(arr);
        System.out.println(ans);
    }
}
