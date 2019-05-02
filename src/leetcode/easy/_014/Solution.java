package leetcode.easy._014;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strNums = strs.length;
        int minLen = strs[0].length();
        for (String s :
                strs) {minLen=Math.min(minLen, s.length());
        }
        for (int j = 0; j < minLen; j++){
             for (int i = 0; i < strNums; i++) {
                if(strs[0].charAt(j)!=strs[i].charAt(j)) return strs[0].substring(0, j);
            }
        }
        return strs[0].substring(0, minLen);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"abca","aba","aaab"}));
    }
}
