class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node prev=null;
        Node ref=head;
        
        //first part reversed
        while(k>0){
            Node temp=ref.next;
            
            ref.next=prev;
            prev=ref;
            ref=temp;
            k-=1;  
        }
        
        Node mark=head;
        head=prev;
        
        
        prev=null;
        
        //second part reversed
        while(ref!=null){
            Node temp=ref.next;
            
            ref.next=prev;
            prev=ref;
            ref=temp;
            
        }
        
        
        mark.next=prev;
        
        
        return head;
    }
}
