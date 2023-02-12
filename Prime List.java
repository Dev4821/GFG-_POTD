class Solution
{
     public boolean isPrime(int n){
        if(n<=1)    return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)  return false;
        }
        return true;
    }
     public void makePrime(Node node){
        int val = node.val;
        int i=val-1,j=val+1;
        boolean flag = true;
        while(true){
            if(flag){
                if(isPrime(i)){
                    node.val = i;
                    break;
                }
                i--;
            }else{
                if(isPrime(j)){
                    node.val = j;
                    break;
                }
                j++;
            }
            flag = !flag;
        }   
    }
    Node primeList(Node head){
        Node node = head;
        while(node!=null){
            if(isPrime(node.val)){
                node=node.next;
            }else{
                makePrime(node);
                node = node.next;
            }
        }
        return head;
    }
}
