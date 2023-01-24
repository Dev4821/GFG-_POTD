class Solution {
    void convert(int[] arr, int n) {
               
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int val=0;
        for(int num : temp) hm.put(num , val++);
        for(int i=0;i<n;i++)    arr[i] = hm.get(arr[i]); 
        
    }
}
