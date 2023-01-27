
class Solution
{
    public static final int mod = 1000000007;
    public int CountWays(String str)
    {
         return f(str,0,-1,new Integer[str.length()][28]);
    }
       
    public static int f(String s,int idx,int code,Integer[][] dp) {
        if(code==0 || code>26) return 0;
        if(idx>=s.length()) {
            return 1;
        }
        if(dp[idx][code+1]!=null) return dp[idx][code+1];
        int ans=0;
        ans = add(ans,f(s,idx+1,s.charAt(idx)-'0',dp));
        if(idx!=0) ans = add(ans,f(s,idx+1,(10*code)+(s.charAt(idx)-'0'),dp));
        
        return dp[idx][code+1]=ans;
    }
    
    public static int add(int a,int b) {
        return ((a%mod)+(b%mod))%mod;
    }
}
