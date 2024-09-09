class Solution{
    public int minCost(int[][] cost, int M, int N){
        int m = cost.length;
        int n = cost[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = cost[0][0];

        for(int i =0; i< M; i++){
            dp[i][0] = dp[i-1][0] + cost[i][0];
        }

        for(int j = 0; j< N; j++){
            dp[0][j] = dp[0][j-1] + cost[0][j];
        }

        for(int i=0; i<M; i++){
            for(int j = 0; j <= N; j++){
                dp[i][j] = cost[i][j] + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
            }
        }

        return dp[m][n];
    }
}