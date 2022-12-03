package Tree;

// 129. Sum Root to Leaf Numbers
// 12-3
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
    public int sumNumbers(TreeNode root) {
        output = 0;
        sum(root, Integer.toString(root.val));
        return output;
    }

    public void sum(TreeNode root, String currentSum){
        
        if (root.left == null && root.right == null){
            output += Integer.parseInt(currentSum);
            return;
        }
    
        if (root.left != null) sum(root.left, concat(currentSum, root.left.val));
        if (root.right != null) sum(root.right, concat(currentSum, root.right.val));
    }
    
    public String concat(String currentSum, int rootVal){
        String b = Integer.toString(rootVal);
        return currentSum+b;
    }

    private int output;

}