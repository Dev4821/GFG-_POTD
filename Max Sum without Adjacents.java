
class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int first  = arr[0];
        int sum = 0;
        for(int i=1;i<n;i++){
            int k = sum+arr[i];
            int nsum = Math.max(sum,first);
            first = k;
            sum =nsum;
        }
        return Math.max(sum,first);
    }
}
