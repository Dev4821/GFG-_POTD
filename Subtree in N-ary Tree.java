
class Solution{
    Map<String,Integer> map = new HashMap<>();
    public int duplicateSubtreeNaryTree(Node root){
       // Code here
       int ans =0;
       solve(root);
       
       for(Map.Entry<String,Integer> e : map.entrySet())
       {
           if(e.getValue()>1)
           {
               ans++;
           }
       }
       return ans;
    }
    
    String solve(Node root)
    {
        String str = root.data+"";
        for(Node n : root.children)
        {
            str += solve(n);
        }
        map.put(str,map.getOrDefault(str,0)+1);
        return str;
    }
    
}
