public class problem79 {
    public boolean find(int index,char[][] board,String word,int m,int n,int i,int j)
    {
        if(index==word.length())
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j])
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';
        boolean found = find(index+1,board,word,m,n,i+1,j) || find(index+1,board,word,m,n,i-1,j) || find(index+1,board,word,m,n,i,j+1) || find(index+1,board,word,m,n,i,j-1);
        board[i][j] = temp;

        return found;

    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(find(0,board,word,m,n,i,j))
                {
                    return true;
                }
            }
        }
        return false;

    }
}
