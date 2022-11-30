package Tree;

// 814. Binary Tree Pruning
// 11-29

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
    public TreeNode pruneTree(TreeNode root) {
        containsOne(root);
        return root; // 注意记得return
    }
    public boolean containsOne(TreeNode node){
        if (node == null) return false;
        boolean left = containsOne(node.left);
        boolean right = containsOne(node.right); 
        
        if (!left) node.left = null;
        if (!right) node.right = null;
        return left||right||node.val==1;
    }
}