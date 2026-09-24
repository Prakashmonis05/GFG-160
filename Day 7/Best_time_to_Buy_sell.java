class Solution {
    public int maxProfit(int[] prices) {
        // code here
        int left=0;
        int right=0;
        int profit=0;
        
        while(right<prices.length-1)
        {
            if(prices[right]<=prices[right+1])
            {
                right++;
            }
            else
            {
                profit+=prices[right]-prices[left];
                left=right+1;
                right=right+1;
            }
        }
        profit+=prices[right]-prices[left];
        return profit;
    }
}