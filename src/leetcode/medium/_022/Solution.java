package leetcode.medium._022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {


        getValid("", 0, 0, n);
        return res;
    }
    public void getValid(String s, int left, int right, int n){

        if(s.length()==2*n) {
            res.add(s);
            return;
        }

        if(left<n) getValid(s+"(", left+1, right,n);
        if(right<left) getValid(s+")", left, right+1, n);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }
}
