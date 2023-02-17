
class Solution {

    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        int n=N-K;
        long sum=0;
        if(N <= K){

            return GeekNum.get(N-1);
        }

        for(int i=0; i<K; i++){
            sum=sum+GeekNum.get(i);
        }

        int low=0;

        for(int i=0; i<n-1; i++){
          
            GeekNum.add(sum);

           
            sum=sum-GeekNum.get(low++);

            sum=sum+GeekNum.get(GeekNum.size()-1);
        }
        return sum;
    }
}
