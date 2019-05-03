package leetcode.medium._098;

import java.util.LinkedList;

public class SolutionByIterator {
    public boolean isValidBST(TreeNode root) {
        Long value = Long.MIN_VALUE;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pt = root;


        while(pt!=null||!stack.isEmpty()){
            while(pt!=null){
                stack.push(pt);
                pt=pt.left;
            }
            pt = stack.pop();
            if(value >= pt.val) return false;
            else value = (long)pt.val;
            pt=pt.right;
        }
        return true;
    }
}
