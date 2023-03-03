
class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> ls=new ArrayList<Long>();
        Long gcd=findGCD(L,B);
        long minSide=gcd;
        long numSquares=(L/gcd)*(B/gcd);
        ls.add(numSquares);
        ls.add(minSide);
        return ls;
    }
     public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
     }
}
