
class Solution {
  public:
    int minVal(int a, int b) {
        int cb=0;
        int B=b;
        while(B)
        {
            cb+=B%2;
           B= B/2;
        }
        int ans=0;
        int cx=cb;
        for(int i=31;i>=0&& cx;i--)
        {
            if((a&(1<<i)))
            {
               ans|=(1<<i);
               cx--;
            }
        }
        for(int i=0;i<=31 && cx;i++)
        {
            if((a&(1<<i))==0 )
            {
                ans|=(1<<i);
               cx--;
            }
        }
        return ans;
    }
};
