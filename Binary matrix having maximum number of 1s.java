class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        int max1=0;
        int leastrow=0;
        
        for(int i=0;i<rows;i++)
        {
                int start=0;
                int end=cols-1;
                
                while(start<=end)
                {
                    int mid = start+(end-start)/2;
                    
                    if(mat[i][mid]==0)
                    start=mid+1;
                    
                    else
                    end=mid-1;
                }
             int tempmax1= cols-start;
             if(tempmax1>max1)
             {
                 max1=tempmax1;
                 leastrow=i;
             }
        }
        
        return  new int[] {leastrow, max1};
    }
};
