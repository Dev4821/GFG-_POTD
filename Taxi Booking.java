
class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
      int min = Integer.MAX_VALUE;
      int ans;
      for(int i=0;i<N;i++)
      {
          ans=Math.abs(pos[i]-cur)*time[i];
          if(ans<min)
          {
              min=ans;
          }
      }
      return min;
    }
}
     
