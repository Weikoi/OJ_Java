package leetcode.easy._020;

public class Solution {
    public boolean isValid(String s) {

        //建立栈，top指针指向栈顶，自定义栈为空时，数组(栈)长度为一
        char[] stack = new char[s.length()+1];

        int top=1;

        for (char c :
                s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') stack[top++] = c;
            else if(c==')'&&stack[--top]!='(') return false;
            else if(c==']'&&stack[--top]!='[') return false;
            else if(c=='}'&&stack[--top]!='{') return false;
        }
        return top==1;
    }
}
