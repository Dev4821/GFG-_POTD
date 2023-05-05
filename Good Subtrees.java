//User function Template for Java
class Solution
{
    public static int goodtree = 0;
    public static HashSet<Integer> fun(Node root, int k){
        if(root == null) return new HashSet<>();
        HashSet<Integer> left =  fun(root.left, k);
        HashSet<Integer> right = fun(root.right, k);
        
        left.addAll(right);
        left.add(root.data);
        if(left.size() <=k) goodtree++;
        return left;
    }
    public static int goodSubtrees(Node root,int k)
    {
        
        fun(root, k);
        int tree = goodtree;
        goodtree=0;
        return tree;
    }
}
