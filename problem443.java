public class problem443 {
    public int compress(char[] chars) {
        int count =1;
        int index=0;
        StringBuilder s = new StringBuilder();
        for(int i=1;i<=chars.length;i++)
        {
            if(i<chars.length && chars[i]==chars[i-1])
            {
                count++;
            }
            else
               { chars[index++]=chars[i-1];
                if(count>1)
                {
                    for(char c : Integer.toString(count).toCharArray())
                    {
                        chars[index++]=c;
                    } 
                }
                count=1;
                }
        }
        return index;
    }
}
