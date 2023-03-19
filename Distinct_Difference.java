
class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
      ArrayList<Integer> list =new ArrayList<>();
      Set<Integer> set1=new HashSet<>();
      int []left=new int[N];
      int []right =new int[N];
      for(int i=0;i<N;i++)
      {
          left[i]=set1.size();
          set1.add(A[i]);
      }
      set1.clear();
      for(int i=N-1;i>=0;i--)
      {
          right[i]=set1.size();
          set1.add(A[i]);
          
      }
      for(int i=0;i<N;i++)
      {
          list.add(left[i]-right[i]);
      }
      return list;
    }
    
}
  
