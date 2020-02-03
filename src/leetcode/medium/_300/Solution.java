package leetcode.medium._300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<2){ return nums.length;}
        int nums_l = nums.length;
        int[] dp = new int[nums_l];
        dp[0] = 1;
        int res = 0;
        for (int i = 1; i < nums_l; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
