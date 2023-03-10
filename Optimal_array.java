
class Solution {
    public long[] optimalArray(int n,int a[])
    {
       long[] res=new long[n];
        long[] pref=new long[n];
        long sum=a[0];
        pref[0]=sum;
        for(int i=1;i<n;i++){
            sum+=a[i];
            pref[i]=sum;
        }
        res[0]=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
                int mid=i/2;
                long sum1=pref[i]-pref[mid]-pref[mid-1];
                res[i]=sum1;
            }
            else{
                int mid=i/2;
                long sum1=pref[i]-2*pref[mid];
                res[i]=sum1;
            }
        }
        return res;   
    }
}
 
