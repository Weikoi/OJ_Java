package leetcode.medium._017;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("234"));
    }
    public List<String> letterCombinations(String digits) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        res.add("");
        for(Character d:digits.toCharArray()){
            List<String> demo = new ArrayList<>();
            for(Character c:dict.get(d).toCharArray()){
                for(String s:res){
                    demo.add(new StringBuilder(s).append(c).toString());
                }
            }
            res = demo;
        }
        return res;
    }

}
