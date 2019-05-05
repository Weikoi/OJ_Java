package leetcode.medium._102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int lastLevelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            while(lastLevelSize>0){
                TreeNode node = queue.pop();
                level.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                lastLevelSize--;
            }

            res.add(level);

        }
        return res;
    }
}
