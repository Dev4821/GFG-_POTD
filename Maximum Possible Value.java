class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
     long ans=0;
        long sticks=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<B.length;i++){
            int temp=B[i]/2;
            if(temp>0){
                min=Math.min(min,A[i]);
                sticks+=temp*2;
                ans+=(temp*2)*A[i];
            }
        }
        long rem=sticks%4;
        return ans-(rem*min);
    }
} 
