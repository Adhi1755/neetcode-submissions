class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int start = 0 , end = 1;

        while(end < nums.length){
            if(nums[start] < nums[end]){
                profit = Math.max(profit,nums[end] - nums[start]);
            }else{
                start = end;
            }

            end++;
        }

        return profit;
    }
}
