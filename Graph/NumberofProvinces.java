package Graph;

public class NumberofProvinces {
    public static void main(String[] args) {
        //gfg question
    }
}

/*
  class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>> adjlist, boolean [] vis , int node ){
        vis[node] = true;
        
        for(int it : adjlist.get(node)){
            if(vis[it] == false){
                dfs(adjlist , vis , it);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

        //changing ajdmatrix to adjlist--
        for(int i = 0 ; i < V ; i++){
            adjlist.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < V ; i++){
            for(int j = 0 ; j < V ; j++){
                if(adj.get(i).get(j) == 1 && i != j){
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
                
            }
        }

        //main 
        
        boolean [] vis = new boolean[V];
        int  count = 0;
        
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                count++;
                dfs(adjlist , vis , i);
            }
        }
        
        return count;
    }
};
 */
