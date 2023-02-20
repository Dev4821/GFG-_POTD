class Solution{

 public static int countPaths(int N){

 //code here

 if(N<2){

     return 0;

 }

 long mod=1000000007;

 long  method=0;

 long i=2;

 while(i<=N){

     method=(method*3)%mod;

     if(i%2==0){

         method=(method+3)%mod;

     }

     else{

         method=(method-3)%mod;

     }

     i++;

 }

 return (int)method;

 }

}
