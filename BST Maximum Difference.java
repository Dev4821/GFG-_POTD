
class Solution
{
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        Node targetNode=search(root,target);
        if(targetNode==null){
            return -1;
        }
        int sum1=SumuptoTargetNode(root,target);
        // System.out.println(sum1);
        int sum2=Sum(targetNode);
        // System.out.println(sum2);
        return sum1-sum2;
        
    }
    public static Node search(Node root,int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
            return root;
        }
        if(root.data>target){
            return search(root.left,target);
        }
        else{
            return search(root.right,target);
        }
    }
    public static int Sum(Node root){
        
        if(root.left==null && root.right==null){
            return root.data;
        }
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
            min=Math.min(min,Sum(root.left));
        }
        if(root.right!=null){
            min=Math.min(min,Sum(root.right));
        }
        return min+root.data;
    }
    public static int SumuptoTargetNode(Node root,int target){
        int sum=root.data;
        if(root.data==target){
            return sum;
        }
        if(root.data<target){
            sum+=SumuptoTargetNode(root.right,target);
        }
        if(root.data>target){
            sum+=SumuptoTargetNode(root.left,target);
        }
        return sum;
        
    }
}
