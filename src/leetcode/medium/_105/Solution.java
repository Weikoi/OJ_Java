package leetcode.medium._105;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);

        int idx = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) idx = i;
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, idx+1), Arrays.copyOfRange(inorder, 0, idx));
        root.right = buildTree(Arrays.copyOfRange(preorder, idx + 1, preorder.length), Arrays.copyOfRange(inorder, idx + 1, inorder.length));
        return root;
    }
}
