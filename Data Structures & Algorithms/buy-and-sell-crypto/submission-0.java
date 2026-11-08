class Solution {
    public int maxProfit(int[] prices) {
        int minCp = Integer.MAX_VALUE, maxProfit = 0;

        for (int sp : prices) {
            if (sp < minCp) minCp = sp;

            int profit = sp - minCp;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
