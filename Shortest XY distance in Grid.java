class coordinate{
    int x;
    int y;
    coordinate(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N ,int M) {
        List<coordinate> x=new ArrayList<>();
        List<coordinate> y=new ArrayList<>();
        
       for (int i=0;i<N;i++)
       {
           for(int j=0;j<M;j++)
           {
               if(grid.get(i).get(j)=='X')
               {
                  x.add(new coordinate(i,j));
                   
               }
               else if(grid.get(i).get(j)=='Y')
               {
                  y.add(new coordinate(i,j));
               }
           }
       }
       int min=1000000000;
       int distance=1000000000;
      for(coordinate c:x){
	    for(coordinate c2:y)
	    {
	         distance =Math.abs(c.x-c2.x)+Math.abs(c.y-c2.y);
	         min=Math.min(min,distance);
	    }
	    
	}
       return min;
    }
};
