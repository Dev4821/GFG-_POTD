class Solution{
    void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    int [] lexicographicallyLargest(int [] a, int n) {
        //Write your code here
        boolean found=false;
        int i;
        while(true){
        for(i=0;i<n-1;i++)
        {
           if(a[i]<a[i+1] && (a[i]+a[i+1])%2==0)
           {
               found=true;
               swap(a,i,i+1);
           }
        }
        if(!found)
        break;
        found=false;
        }    
        return a;
    }
}
