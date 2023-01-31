class Solution {
    static int minRepeats(String A, String B) {
         String c ="";
        int count = 0;
        while(c.length()<=2*B.length()){
            c+=A;
            count++;
            if(c.contains(B)){
                return count;
            }
        }
        return -1;
    }
};
