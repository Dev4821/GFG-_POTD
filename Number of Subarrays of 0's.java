class Solution{
	long no_of_subarrays(int N, int [] arr) {
	    long ans=0;
	    
	    int count=0,i=0;
	    while(i<arr.length){
	        if(arr[i]==0){
	            count++;
	            i++;
	        }else{
	            if(count>0){
	                long a=fibo(count);
	                ans+=a;
	            }
	            count=0;
	            i++;
	        }
	    }
	    if(count>0){
	        long a=fibo(count);
	        ans+=a;
	    }
	    return ans;
	}
	private long fibo(int start){
	   long r=1;
	   for(int i=2;i<=start;i++){
	       r+=i;
	   }
	   return r;
	}
}
