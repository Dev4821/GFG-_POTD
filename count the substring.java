class Solution 
{ 
    int countSubstring(String S) 
    { 
        int count=0;
        
        for(int i=0;i<S.length();i++)
        {
            int lower=0;
            int upper=0;
            for(int j=i;j<S.length();j++)
            {
              
              if(Character.isLowerCase(S.charAt(j)))
              {
                  lower++;
              }
              else
              {
                  upper++;
              }
              if(lower==upper)
              {
                  count++;
              }
            }
        }
        return count;
    }
} 
