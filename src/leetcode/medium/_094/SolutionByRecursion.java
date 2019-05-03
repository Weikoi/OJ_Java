package leetcode.medium._094;

import java.util.ArrayList;
import java.util.List;

public class SolutionByRecursion {

    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root ==null) return new ArrayList<>();

        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }
}
