package leetcode.easy._155;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(512);
        ms.push(-1024);
        ms.push(-1024);
        ms.push(512);
        ms.pop();
        ms.getMin();
        ms.pop();
        ms.getMin();
        ms.pop();
        System.out.println(ms.getMin());
    }


}

class MinStack {
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> min = new LinkedList<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek()) min.push(x);

    }

    public void pop() {
        System.out.println(stack.peek().getClass().isPrimitive());
        if (stack.peek().equals(min.peek())) min.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
