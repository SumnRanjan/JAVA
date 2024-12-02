package DP;

public record Fibonacci() {
//gfg
}

/*

class Solution {
    private int fib(int n , int [] dp){
        if(n <= 1){
            return n;
        }
        
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = fib(n-1 , dp) + fib(n-2 , dp);
    }
    public int nthFibonacci(int n) {
        int [] dp = new int [n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        
        return fib(n , dp);
    }
}
 */
