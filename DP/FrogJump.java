package DP;

public class FrogJump {
    public static void main(String[] args) {
        //codeninja question
    }
}



// public class Solution {
//     private static int frog(int i , int [] heights , int [] dp){
//         if(i==0){
//             return 0;
//         }

//         if(dp[i] != -1) return dp[i];

//         int left = frog(i - 1 , heights , dp) + Math.abs(heights[i] - heights[i-1]);
//         int right = Integer.MAX_VALUE;
//         if(i > 1)
//         right = frog(i - 2 , heights , dp) + Math.abs(heights[i] - heights[i-2]);

//         return dp[i] = Math.min(left, right);
//     }
//     public static int frogJump(int n, int heights[]) {
//         /* first way */
//         // int [] dp = new int [n+1];
//         // Arrays.fill(dp , -1);
//         // return frog(n-1 , heights , dp);


//         /* second way */
//         // int [] dp = new int [n];
//         // Arrays.fill(dp , 0);

//         // dp[0] = 0;

//         // for(int i = 1 ; i < n ; i++){
//         //     int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
//         //     int ss = Integer.MAX_VALUE;
//         //     if(i > 1)
//         //     ss = dp[i-2]+ Math.abs(heights[i] - heights[i-2]);

//         //     dp[i] = Math.min(fs , ss);
//         // }

//         // return dp[n-1];

//         /* third  way */

//         int prev = 0;
//         int prev2 = 0;

//         for(int i = 1 ; i < n ; i++){
//             int fs = prev + Math.abs(heights[i] - heights[i-1]);
//             int ss = Integer.MAX_VALUE;
//             if(i > 1)
//             ss = prev2 + Math.abs(heights[i] - heights[i-2]);

//             int curr = Math.min(fs , ss);
//             prev2 = prev;
//             prev = curr;
//         }
        
//         return prev;
//     }

// }