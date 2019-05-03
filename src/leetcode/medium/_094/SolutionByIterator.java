package leetcode.medium._094;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionByIterator {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pt = root;
        stack.add(root);

        while(!stack.isEmpty()|| pt!=null) {
            while (pt != null) {
                stack.push(pt.left);
                pt = pt.left;
            }

            while (!stack.isEmpty()) {
                pt = stack.pop();
                res.add(pt.val);
                stack.push(pt.right);
            }
        }
        return res;
    }
}
