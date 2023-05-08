class Solution{
    int modulo(String s, int m) {
        int sum=0;
        int pow=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
            sum=sum+pow;
            sum=sum%m;
        }
        pow=pow*2;
        pow=pow%m;
        
    }return sum;
    }
}
