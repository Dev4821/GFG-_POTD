class Solution{
    public static int appleSequence(int n, int m, String arr){
        int st=0,end=0,ans=0;
        while(end<n){
            if(arr.charAt(end) =='O' && m>0) m--;
            else{
                if(arr.charAt(end) =='O'){
                    while(arr.charAt(st)!='O') st++;
                    st++;
                }

            }
            ans=Math.max(ans,end-st+1);
            end++;

        }

 

        return ans;
        
    }
}
