package leetcode.medium._006;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> str_list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            str_list.add(new StringBuilder());

        int curRow = 0;
        int goingDown = 1;

        for (char c : s.toCharArray()) {
            str_list.get(curRow).append(c);
            if ((goingDown ==-1 && curRow == 0) || (goingDown ==1 && curRow == numRows - 1)) goingDown = -1*goingDown;
            if(goingDown==1){
                curRow++;}
            else{curRow--;}

        }

        StringBuilder return_str = new StringBuilder();
        for (StringBuilder row : str_list) return_str.append(row);
        return return_str.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("LEETCODEISHIRING", 3));
    }
}