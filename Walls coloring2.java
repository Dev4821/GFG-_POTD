class Solution{
 int minCost(int [][] costs) {

 int[][] dp = new int[costs.length][costs[0].length];

 for (int i = 0; i < costs[0].length; i++) {

 dp[0][i] = costs[0][i];

 }

 

 for (int i = 1; i < costs.length; i++) {

 for (int j = 0; j < costs[0].length; j++) {

 int paint = costs[i][j];

 int min = Integer.MAX_VALUE;

 for (int k = 0; k < costs[0].length; k++) {

 if (k != j) {

 min = Math.min(min, dp[i-1][k]);

 }

 }

 if(min == Integer.MAX_VALUE){

     return -1;

 }

 dp[i][j] = min + paint;

 }

 }

 int min_value = Integer.MAX_VALUE;

 for (int i = 0; i < costs[0].length; i++) {

 min_value = Math.min(dp[costs.length - 1][i], min_value);

 }

 return min_value;

 }
}
