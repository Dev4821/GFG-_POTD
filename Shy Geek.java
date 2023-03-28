*/
class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        
    long maxChocolates = 0;
    
    int left = 0;
    int right = n - 1;

    while (k > 0) {
       
        int maxPrice = 0;
       
        while (left <= right) {
           
            int mid = (left + right) / 2;
           
            int price = shop.get(mid);
           
            if (price > k) {
                right = mid - 1;
           
            } else {
                maxPrice = price;
                left = mid + 1;
            }
        }
       
        if (maxPrice == 0) {
            break;
        }
        
        int numChocolates = (int) (k / maxPrice);
       
        maxChocolates += numChocolates;
      
        k = k % maxPrice;
        
        left = 0;
    }
    
    return maxChocolates;
    }

}
