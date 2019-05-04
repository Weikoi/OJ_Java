package leetcode.medium._003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//暴力法
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lenOfS = s.length();
        int ans = 0;
        for (int i = 0; i < lenOfS; i++) {
            for (int j = i; j <= lenOfS; j++) {
                if (Unique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    private boolean Unique(String s, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int k = i; k < j; k++) {
            Character ch = s.charAt(k);
            if (set.contains(ch))return false;
            set.add(ch);
        }
        return true;
    }

    //时间复杂度优化
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}

