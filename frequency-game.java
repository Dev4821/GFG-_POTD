class Solution {
  
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:arr)
            map.put(num,map.getOrDefault(num,0)+1);
        
        int minFreq=Integer.MAX_VALUE;
        
        for(Map.Entry<Integer, Integer> it: map.entrySet())
            minFreq=Math.min(minFreq,it.getValue());
            
        int highValue=0;
        
        for(Map.Entry<Integer, Integer> it: map.entrySet())
            if(it.getValue()==minFreq)highValue=Math.max(highValue,it.getKey());
        
        return highValue;
    }
}
