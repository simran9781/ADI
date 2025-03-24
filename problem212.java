import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problem212 {
     public boolean find(int index,String word,char[][] board,int i,int j,int m,int n)
    {
        if(index==word.length())
        {
            return true;
        }

        if(i<0 || i>=m || j<0 || j>=n || word.charAt(index)!=board[i][j])
        {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = find(index+1,word,board,i+1,j,m,n) || find(index+1,word,board,i-1,j,m,n) || find(index+1,word,board,i,j+1,m,n) || find(index+1,word,board,i,j-1,m,n);

        board[i][j] = temp;
        return found;
    }
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> ans = new HashSet<>();
        int m = board.length;
        int n = board[0].length;

        for(int k=0;k<words.length;k++)
        {
            String word = words[k];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(word.charAt(0)==board[i][j] && find(0,word,board,i,j,m,n))
                    {
                        ans.add(word);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
