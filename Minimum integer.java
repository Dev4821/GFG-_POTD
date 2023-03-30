class Solution {
    public static int minimumInteger(int N, int[] A) {
     long sum =0;
     for(int i=0;i<N;i++)
     {
         sum+=A[i];
     }
     int min=Integer.MAX_VALUE;
     for(int i=0;i<N;i++)
     {
        if((long)A[i]*N>=sum && A[i]<min)
        {
            min=A[i];
        }
     }
     return min;
    }
}
