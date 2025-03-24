import java.util.Arrays;

public class problem1143 {
    public int find(int index1,int index2,String text1, String text2,int[][] dp)
    {
        if(index1<0 || index2<0)
        {
            return 0;
        }
        if(text1.charAt(index1)==text2.charAt(index2))
        {
            return dp[index1][index2]= 1+find(index1-1,index2-1,text1,text2,dp);
        }

        if(dp[index1][index2]!=-1)
        {
            return dp[index1][index2];
        }

        return  dp[index1][index2]=Math.max(find(index1-1,index2,text1,text2,dp),find(index1,index2-1,text1,text2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();

        int[][] dp = new int[n1][n2];
        for(int[] a: dp)
        {
            Arrays.fill(a,-1);
        }
        return find(n1-1,n2-1,text1,text2,dp);
    }
}
