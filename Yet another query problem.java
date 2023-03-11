class Solution {

    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {

        // code here

        ArrayList<Integer> arrl =new ArrayList<>();

        

        for(int row=0;row<num;row++){

 

            int l=Q[row][0];

            int r=Q[row][1];

            int k=Q[row][2];

            

            HashMap<Integer,Integer> hm=new HashMap<>();

            for(int i=l;i<N;i++){

                if(hm.containsKey(A[i])){

                    hm.put(A[i],hm.get(A[i])+1);

                }

                else{

                    hm.put(A[i],1);

                }

            }

            int count=0;

            

            for(int i=l;i<=r;i++){

                int c=hm.get(A[i]);

                if(c==k){

                    count++;

                }

                if(c==1){

                    hm.remove(A[i]);

                }

                else{

                    hm.put(A[i],c-1);

                }

                

            }

            arrl.add(count);

        }

        return arrl;

        

    }

}
