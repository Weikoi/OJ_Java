package leetcode.medium._003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0, r = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();

        while (l < s.length() && r < s.length()) {
            if (set.contains(s.charAt(r))) {

                set.remove(s.charAt(l));
                l++;
            } else {
                set.add(s.charAt(r));
                r++;
            }
            if (res < (r - l)) res = r - l;
        }
        return res;

    }
}

