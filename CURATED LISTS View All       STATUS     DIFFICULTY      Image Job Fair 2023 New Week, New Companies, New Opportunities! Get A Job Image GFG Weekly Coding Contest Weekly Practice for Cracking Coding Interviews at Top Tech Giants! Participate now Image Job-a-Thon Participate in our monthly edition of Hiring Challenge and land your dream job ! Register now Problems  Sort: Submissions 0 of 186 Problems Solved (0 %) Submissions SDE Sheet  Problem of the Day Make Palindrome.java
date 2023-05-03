
class Solution {
public static boolean makePalindrome(int n, String[] arr) {
        // code here
       HashMap<String, Integer> map = new HashMap<>();
       boolean selfPalindrome = false;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}
        int count =0;
        boolean flag = true;
		for (int i = 0; i < n; i++) {
			// Check if reverse of arr[i]
			String rev = String.valueOf(new StringBuilder(arr[i]).reverse());
			if(arr[i].equals(rev) && map.get(rev)>1 && flag){
			    if(map.get(rev)%2!=0 && count==map.get(rev)-2){
			        flag = false;
			    }
			    count++;
			}
			else if (arr[i].equals(rev) && !selfPalindrome) {
                selfPalindrome = true;
			}
			else if (map.containsKey(rev) && !arr[i].equals(rev)) {
				// Check if the values matches too
				if (map.get(rev) != map.get(arr[i])) {
					return false;
				}
			} 
			else
				return false;
		}

		return true;
        
    }
 
}
   
