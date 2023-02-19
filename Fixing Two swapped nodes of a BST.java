
class Solution {
   public Node correctBST(Node root) {
        // code here.
        
        List<Integer> values = new ArrayList<>();
        inOrder(root,values);
        Collections.sort(values);
        int[] index = {0};
        updateTree(root,values,index);
        
        return root;
    }
    
    public void inOrder(Node root , List<Integer> values){
        
        if(root==null){
            return;

        }
        
        inOrder(root.left,values);
        values.add(root.data);
         inOrder(root.right,values);
    }
    
    public void updateTree(Node root , List<Integer> values , int[] index){
         if(root==null){
            return;

        }
        
        updateTree(root.left,values,index);
        root.data=values.get(index[0]++);
         updateTree(root.right,values,index);
    }
}
