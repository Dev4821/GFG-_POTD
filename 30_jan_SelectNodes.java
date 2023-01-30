class Solution{
  public:
  int count=0;
  bool dfs(vector<int> adj[],vector<int> &visited,int node){
      //mkae node visted
      visited[node]=1;
      bool select=false;
      for(auto i:adj[node]){
          if(visited[i]==0){
              
            //call the dfs for the child
            bool isChildSelected=dfs(adj,visited,i);
            
            //means if child is not selected than select the parent
            if(!isChildSelected){
                select=true;
            }
          }
          
      }
      
      //increment the count if the current node is selected
      if(select){
          count++;
      }
      return select;
      
  }
  
    int countVertex(int N, vector<vector<int>>edges){
        
        //making adjacency matrix
        vector<int> adj[N+1];
        for(auto i:edges){
            int v=i[0];
            int u=i[1];
            adj[v].push_back(u);
            adj[u].push_back(v);
        }
        
        //visted array
        vector<int> visited(N+1,0);
        dfs(adj,visited,1);
        return count;
        
    }
};
