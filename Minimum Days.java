
class Solution {
    public static int getMinimumDays(int N, String Str, int[] P) {
          StringBuilder S = new StringBuilder(Str);
        int count =0;
        if(N==1) return 0;
        for(int i=0;i<N-1;i++)
        {
            if(S.charAt(i)==S.charAt(i+1))
            count++;
        }
        int i=0;
        while(count!=0)
        {
            int index =P[i];
            if(S.charAt(index)!='?'){
                  if(index!=0)
                {
                  if(S.charAt(index)==S.charAt(index-1))count--;
                }
                  if(index!=N-1)
                {
                  if(S.charAt(index)==S.charAt(index+1))count--;
                }
                S.setCharAt(index,'?');
            }
            i++;
        }
        return i;
    }
}
   
