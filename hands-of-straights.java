
class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        //if we can't divide into groups return false
        if(hand.length % groupSize != 0) return false;
        //implement priority Queue
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        //elements will be directly sorted
        for (int values : hand){
            pq.add(values);
        }
        // for an element delete (groupSize-1) consecutive values
// for input 1 :  for 1st element i.e 1 delete 2 consecutive values i.e 2 , 3
// note: if we can't find 2,3 them we return false
        while(!pq.isEmpty()){
            int smallest = pq.poll();
            for(int i =1;i<groupSize;i++){
                if(pq.remove(smallest+i)) continue;
                // if we can't delete  return false
                // (if a numbers consecutive value is not present)
                else return false;
            }
        }
        return true;
    }
}
