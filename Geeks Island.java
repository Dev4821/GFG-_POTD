
class Pair{

    int row;

    int col;

    Pair(int row, int col){

        this.row = row;

        this.col = col;

    }

}

class Solution{

 int water_flow(int [][] mat, int N, int M) {

 int [][] IndianOcean = new int[N][M];

 int [][] ArabicOcean = new int[N][M];

 Queue<Pair> queue = new LinkedList<>();

 Queue<Pair> queue2 = new LinkedList<>();

 int count = 0;

 for(int i=0; i< N; i++){

     for(int j=0; j< M; j++){

         if(i==0 || j == 0){

             queue.add(new Pair(i, j));

             IndianOcean[i][j] = 1;

         }

         if(i == N-1 || j == M-1) {

             ArabicOcean[i][j] = 1;

             queue2.add(new Pair(i,j));

         }

     }

 }

 int []delRow = {-1, 0, 1, 0};

 int []delCol = {0, 1, 0, -1};

 while(!queue.isEmpty()){

     Pair pair = queue.remove();

     for(int i=0; i< 4; i++){

         int NRow = delRow[i] + pair.row;

         int NCol = delCol[i] + pair.col;

         if(NRow >= 0 && NRow < N && NCol >= 0 && NCol < M &&

         IndianOcean[NRow][NCol] == 0 && mat[NRow][NCol] >= mat[pair.row][pair.col]){

             IndianOcean[NRow][NCol] = 1;

             queue.add(new Pair(NRow, NCol));

         }

     }

 }

 

 while(!queue2.isEmpty()){

     Pair pair = queue2.remove();

     for(int i=0; i< 4; i++){

         int NRow = delRow[i] + pair.row;

         int NCol = delCol[i] + pair.col;

         if(NRow >= 0 && NRow < N && NCol >= 0 && NCol < M &&

         ArabicOcean[NRow][NCol] == 0 && mat[NRow][NCol] >= mat[pair.row][pair.col]){

             ArabicOcean[NRow][NCol] = 1;

             queue2.add(new Pair(NRow, NCol));

         }

     }

 }

 

 for(int i=0; i< N; i++){

     for(int j=0; j< M; j++){

         if(ArabicOcean[i][j] == 1 && IndianOcean[i][j] == 1) count++;

     }

 }

 return count;

 }

}
