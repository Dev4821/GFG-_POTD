class Solution {
   long[] countZero(int N, int K, int[][] arr){
        // code here
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        long[] ans = new long[K];
        long n =N;
        long total_grid=n*n;
        long total_one,r,c;
        for(int i=0;i<K;i++) {
            row.add(arr[i][0]);
            col.add(arr[i][1]);
            r=row.size();
            c=col.size();
            total_one = ((r+c)*n) - (r*c);
            ans[i]=total_grid - total_one;
        }
        return ans;
    }
}
