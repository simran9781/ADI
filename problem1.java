public class problem1 {
    public static void find(int n){
        int total = n*n;
        int i=1;
        int m = n;
        int row = 0;
        int col=0;
        int rm = m-1;
        int cn = n-1;

        int[][] arr = new int[m][n];
        

        while(i<=total){
            for(int index=cn;index>=col && i<=total ;index--){
                arr[row][index]=i;
                i++;
            }
            row++;

            for(int index=row;index<=rm && i<=total ;index++){
                arr[index][col]=i;
                i++;
            }
            col++;

            for(int index=col;index<=cn && i<=total ;index++){
                arr[rm][index]=i;
                i++;
            }
            rm--;

            for(int index=rm;index>=row && i<=total ;index--){
                arr[index][cn]=i;
                i++;
            }
            cn--;
        }
        i=0;
        for(i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        find(n);
    }
}
