package leetcode.medium._098;


// 递归写法
public class SolutionByRecursion {
    Long value = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root!=null) return true;

        if(isValidBST(root.left)){
            if(value < root.val){
                value = (long)root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
