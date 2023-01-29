class Solution {
    public static int solve(int a, int b) {
     return (a == b) ? 0 : (((a == (a & b)) || (b == (a & b))) ? 1 : 2);
    }
}
 
