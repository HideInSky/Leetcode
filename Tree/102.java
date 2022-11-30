package Tree;

import java.util.ArrayList;
import java.util.List;

// 102. Binary Tree Level Order Traversal
// 11-27
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> levels = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
    
    public void helper(TreeNode node, int level){
        if (node == null) return;
        if (levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        helper(node.left, level+1);
        helper(node.right, level+1);
    }
}