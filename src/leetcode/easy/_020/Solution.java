package leetcode.easy._020;

import java.util.LinkedList;

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
    public boolean isValid2(String s) {

        LinkedList<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') stack.push(c);

            else if (c == ')') {if (stack.isEmpty()||stack.pop() != '(') return false;}
            else if (c == ']') {if (stack.isEmpty()||stack.pop() != '[') return false;}
            else if (c == '}') {if (stack.isEmpty()||stack.pop() != '{') return false;}
            System.out.println(stack);
        }
        if (stack.size() == 0) return true;

        else return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid2("[](){}"));
    }
}
