package Graph;

public class NumberOfIsland {

    public static void main(String[] args) {
        //letcode
    }
}


/*
leetcode
 
class Solution {
    private void dfs(int r, int c, int[][] vis, char[][] grid) {
        vis[r][c] = 1;

        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int[] dir : directions) {
            int nrow = r + dir[0];
            int ncol = c + dir[1];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                dfs(nrow, ncol, vis, grid);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    dfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
} 

 */


/*
//gfg

class Solution {
    private void dfs(int r, int c, int[][] vis, char[][] grid) {
        vis[r][c] = 1;

        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int[] dir : directions) {
            int nrow = r + dir[0];
            int ncol = c + dir[1];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                dfs(nrow, ncol, vis, grid);
            }
        }

    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    dfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
}
*/