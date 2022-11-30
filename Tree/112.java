package Tree;

// 112. Path Sum
// 11-30
// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if (root == null) return false;
//         boolean left = hasPathSum(root.left, targetSum-root.val);
//         boolean right = hasPathSum(root.right, targetSum-root.val);
//         return left || right || root.val == targetSum;
//     }
// }

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        boolean left = hasPathSum(root.left, targetSum-root.val);
        boolean right = hasPathSum(root.right, targetSum-root.val);
        if (isLeaf(root)) return left || right || root.val == targetSum;
        return left || right; 
    }

    public boolean isLeaf(TreeNode node){
        if (node.left == null && node.right == null) return true;
        return false;
    }
}