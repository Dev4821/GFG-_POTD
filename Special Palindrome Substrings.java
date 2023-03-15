class Solution{
    public  static int specialPalindrome(String a, String b){
       //Code Here
        int ans=Integer.MAX_VALUE;
       for(int i=0;i<=a.length()-b.length();i++) {
           int val = f(a,b,i,i+b.length()-1);
           if(val!=-1) ans=Math.min(ans,val);
       }
       if(ans==Integer.MAX_VALUE) ans=-1;
       return ans;
    }
    
    public static int f(String a,String b,int strt,int end) {
        int ans=0;
        for(int i=0,j=a.length()-1;i<=j;i++,j--) {
            if(i>=strt && i<=end) {
                if(j>=strt && j<=end) {
                    if(b.charAt(i-strt)!=b.charAt(j-strt)) return -1;
                    if(a.charAt(i)!=b.charAt(i-strt)) ans++;
                    if(a.charAt(j)!=b.charAt(j-strt) && i!=j) ans++;
                } else {
                    if(a.charAt(i)!=b.charAt(i-strt)) ans++;
                    if(b.charAt(i-strt)!=a.charAt(j) && i!=j) ans++;
                }
            } else {
                if(j>=strt && j<=end) {
                    if(a.charAt(j)!=b.charAt(j-strt)) ans++;
                    if(b.charAt(j-strt)!=a.charAt(i) && i!=j) ans++;
                } else {
                    if(a.charAt(i)!=a.charAt(j)) ans++;
                }
            }
        }
        return ans;
    }
}
