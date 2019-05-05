package leetcode.medium._103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        while(!queue.isEmpty()){

            int towardsLeft = -1;
            int lastLevelSize = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            while(lastLevelSize-->0){

                TreeNode node = queue.pop();
                level.add(node.val);

                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                towardsLeft *= -1;

            }

            if(towardsLeft==-1) res.add(level);
            else {
                Collections.reverse(level);
                res.add(level);
            }
        }
        return res;
    }

}