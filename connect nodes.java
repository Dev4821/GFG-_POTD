class Solution {
    public void connect(Node root) {
        Queue<Node> qq = new LinkedList<>();
        qq.offer(root);
        
        while(!qq.isEmpty())  {
            int size = qq.size();
            Node prev = null;
            
            for(int i=0; i<size; i++)  {
                Node curr = qq.poll();
                if(prev != null) prev.nextRight = curr;
                prev = curr;
                
                if(curr.left != null) qq.offer(curr.left);
                if(curr.right != null) qq.offer(curr.right);
            }
            prev.nextRight = null;
        }}}
