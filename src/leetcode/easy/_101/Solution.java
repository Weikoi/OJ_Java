package leetcode.easy._101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;
        else if(left==null && right!=null) return false;
        else if(right==null && left!=null) return false;
        else return (left.val==right.val)&&(check(left.left, right.right)&&(check(left.right, right.left)));
    }
}
