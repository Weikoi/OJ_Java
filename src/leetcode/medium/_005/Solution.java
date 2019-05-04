package leetcode.medium._005;

public class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        if(n<2) return s;
        int start = 0, end = 0;

        for(int i=0;i<n;i++){
            dp[i][i] = true;
            for(int j=0;j<i;j++){
                if(j + 1 == i){
                    dp[j][i] = (s.charAt(j) == s.charAt(i));
                }else{
                    dp[j][i] = (dp[j+1][i-1] && (s.charAt(j)==s.charAt(i)));
                }
                if(dp[j][i] && i - j > end-start){
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start,end+1);

    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}
