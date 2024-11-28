package Graph;

public class CycleUndirectGraph {
    public static void main(String[] args) {
        //geekforgeeks
    }
}


/*
class Pair{
    int first;
    int second;
    
    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    private boolean checkForCycle(int src ,  int n , ArrayList<ArrayList<Integer>> adj , boolean [] vis){
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(src , - 1));
        
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            
            for(int adjNode : adj.get(node)){
                if(vis[adjNode] == false){
                    vis[adjNode] = true;
                    q.offer(new Pair(adjNode , node));
                }
                else if(parent != adjNode){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(int src , int par , int [] vis ,  ArrayList<ArrayList<Integer>> adj){
        vis[src] = 1;
        
        for(int adjnode : adj.get(src)){
            if(vis[adjnode] == 0){
                 if(dfs(adjnode , src , vis , adj)) return true;
            }
            else if(adjnode != par){
                return true;
            }
        }
        
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        // boolean [] vis = new boolean[n];
        // for(int i = 0 ; i < n ; i++){
        //     vis[i] = false;
        // }
        
        // for(int i = 0 ; i < n ; i++){
        //     if(vis[i] == false){
        //         if(checkForCycle(i , n , adj , vis)){
        //             return true;
        //         }
        //     }
        // }
        //return false;
        
        int [] vis = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            if(vis[i] == 0){
                if(dfs(i , -1 , vis , adj)) return true;
            }
        }
        
        return false;
    }
}
 */