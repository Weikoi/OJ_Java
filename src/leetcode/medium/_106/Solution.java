package leetcode.medium._106;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        int idx = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]) idx = i;
        }
        root.left= buildTree(Arrays.copyOfRange(inorder, 0, idx), Arrays.copyOfRange(postorder, 0, idx));
        root.right= buildTree(Arrays.copyOfRange(inorder, idx + 1, inorder.length), Arrays.copyOfRange(postorder, idx, postorder.length - 1));
        return root;
    }
}
