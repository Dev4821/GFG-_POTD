class Solution {
    int minOperation(String s) {
           int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            boolean flag = true;
            for(int j=0; j<i; j++)
            {
                if(i+j >= n) flag = false;
                else if(s.charAt(i+j) != s.charAt(j)) flag = false;
            }
            if(flag!=false && i>0) ans = Math.max(ans, i);
        }
        if(ans == 0) ans++;
        return n-ans+1;
    }
}
