lass Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        int mod= 1000000007;
        int dp[][]=new int[n][m];
        if(grid[0][0]==0||grid[n-1][m-1]==0) return 0;
        int flag=1;
        for(int i=0;i<n;i++)
        { 
            
            if(grid[i][0]==0)
            {
                flag=0;
            }
            if(flag==0)
            {
                grid[i][0]=0;
            }
        }
        flag=1;
        for(int i=0;i<m;i++)
        { 
            
            if(grid[0][i]==0)
            {
                flag=0;
            }
            if(flag==0)
            {
                grid[0][i]=0;
            }
        }
       for(int i=1;i<n;i++)
       {
           for(int j=1;j<m;j++)
           {
             if(grid[i][j]!=0){
                     grid[i][j]=(grid[i-1][j]+grid[i][j-1])%mod ;
                              }
           }
       }
   
        return grid[n-1][m-1];
    }
};
