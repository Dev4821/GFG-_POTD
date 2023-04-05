
class Solution 
{
    public int countSpecialNumbers(int N, int arr[]) 
    {
        
        int count = 0;
       
        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) 
        {
            
            if (i < N - 1 && arr[i]==arr[i+1]) 
            {
                count++;
            } 
            else 
            {
                for (int j = 0; j < i; j++) 
                {
                    if (arr[i] % arr[j] == 0) 
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
