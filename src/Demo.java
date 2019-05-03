import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.push(7);
        stack.pop();
        stack.push(Integer.MIN_VALUE);
        System.out.println(stack);
    }
}
