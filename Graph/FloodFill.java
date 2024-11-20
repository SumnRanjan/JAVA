package Graph;

public class FloodFill {
    public static void main(String[] args) {
        //leetcode - 733
    }
}
/*
class Solution {
    private void dfs(int r , int c , int[][] ans , int[][] image , int [] delrow  , int [] delcol , int iniColor , int color){
        ans[r][c] = color;

        int n = image.length;
        int m = image[0].length;

        for(int i = 0 ; i < 4 ; i++){
            int nrow = r + delrow[i];
            int ncol = c + delcol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
            image[nrow][ncol] == iniColor && ans[nrow][ncol] != color){
                dfs(nrow , ncol , ans , image , delrow , delcol , iniColor , color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int[][] ans = image;

        int [] delrow = {-1 , 0 , +1 , 0};
        int [] delcol = {0 , +1 , 0 , -1};

        dfs(sr , sc , ans , image , delrow , delcol , iniColor , color);
        return ans;
    }
}
 */