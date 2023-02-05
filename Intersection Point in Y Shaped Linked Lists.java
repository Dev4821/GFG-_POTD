class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         //length of two singly linked list
         int len1=0;
         int len2=0;
         Node node1 = head1;
         Node node2 = head2;
         
         //to find length
         while(node1!=null){
             len1++;
             node1=node1.next;
         }
         while(node2!=null){
             len2++;
             node2=node2.next;
         }
         node1=head1;
         node2=head2;
         int diff=0;
         if(len1>len2){
             diff=len1-len2;
             for(int i=0;i<diff;i++){
                 node1=node1.next;
             }
         }
         else{
             diff=len2-len1;
             for(int i=0;i<diff;i++){
                 node2=node2.next;
             }
         }
         while(node1!=null && node2!=null){
             if(node1==node2){
                 return node1.data;
             }
             node1=node1.next;
             node2=node2.next;
         }
         return -1;
	}
}
