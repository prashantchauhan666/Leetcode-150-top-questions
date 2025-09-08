class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]= new int[prices.length+1][2];
        int n=prices.length;
        dp[n][0]=0;
        dp[n][1]=0;
        int profit=0;
        for(int index=prices.length-1 ; index>=0 ; index--){
            for(int buy=0;buy<=1 ; buy++){
                
                if(buy==1){ //we can sell the share
                   profit=Math.max(0+dp[index+1][1] , prices[index]+dp[index+1][0]);
                }
                else{
                    profit=Math.max(0+dp[index+1][0],-prices[index]+dp[index+1][1]);
                }

                dp[index][buy] = profit;
            }
        }

        return dp[0][0];
    }
}