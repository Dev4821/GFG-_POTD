
class Solution{
	int [] updateQuery(int N, int Q, int [][]U){
         int[] res = new int[N];

        for(int j=0; j<Q; j++){

            int l = U[j][0];

            int r = U[j][1];

            int x = U[j][2];

            for(int i=l-1; i<r; i++)res[i]|=x;

        }return res;
    }
}
