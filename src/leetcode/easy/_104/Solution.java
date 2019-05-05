package leetcode.easy._104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else if(root.left==null&&root.right==null) return 1;
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
