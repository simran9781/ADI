public class backtracking {
    public static boolean exist(char[][] brd,String word)
    {
        int m = brd.length;
        int n = brd[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(brd[i][j]==word.charAt(0) && dfs(brd, i, j, word, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] brd,int i,int j,String word,int index)
    {
        if(index==word.length())
        {
            return true;
        }

        if(i<0 || j<0 || i>= brd.length || j>=brd[0].length || brd[i][j]!=word.charAt(index))
        {
            return false;
        }

        char temp = brd[i][j];
        brd[i][j] = '#';

        boolean found = dfs(brd, i+1, j, word, index+1) || dfs(brd, i-1, j, word, index+1) || dfs(brd, i, j+1, word, index+1) || dfs(brd, i, j-1, word, index+1);

        brd[i][j] = temp;

        return found;
    }
    public static void main(String[] args) {
        char[][] brd = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED2";
        System.out.println(exist(brd, word));
    }
}
