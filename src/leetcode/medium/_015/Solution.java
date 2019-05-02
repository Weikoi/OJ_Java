package leetcode.medium._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if(i>0&&nums[i]==nums[i-1])continue;
            int l=i+1;
            int r=len-1;
            int two_sum = 0 - nums[i];
            while(l<r){
                if(nums[l]+nums[r]==two_sum){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r&&nums[l]==nums[l+1])l++;
                    while (l<r&&nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }else if(nums[l]+nums[r]<two_sum) l++;
                else r--;
            }
        }
        return res;
    }
}
