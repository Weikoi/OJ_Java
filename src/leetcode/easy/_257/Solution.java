package leetcode.easy._257;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        getPath(root, "");
        return res;
    }

    private void getPath(TreeNode root, String s) {
        if (root.left == null && root.right == null) {
            res.add(s + root.val);
        }
        if (root.left != null) getPath(root.left, s + root.val + "->");
        if (root.right != null) getPath(root.right, s + root.val + "->");
    }
}
