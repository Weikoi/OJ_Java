package leetcode.medium._011;

public class Solution {
    public int maxArea(int[] height) {
        int res = 0, h = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            h = Math.min(height[l], height[r]);
            if (h * (r - l) > res) res = h * (r - l);
            if (height[l] <= h && l < r) l++;
            if (height[r] <= h && l < r) r--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{10, 20, 5, 6}));
    }
}
