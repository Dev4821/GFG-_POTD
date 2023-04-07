class Solution
{
    public static int addMinChar(String str){
        int res=0;
        int start=0;
        int len=str.length();
        int end=len-1;
        while(start < end) {
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else {
                res++;
                start = 0;
                end = len - res - 1;
            }
        }
        return res;
    }
}
