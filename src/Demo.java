import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String s = "abd def ghj";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set);
    }
}
