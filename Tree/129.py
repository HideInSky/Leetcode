# 129. Sum Root to Leaf Numbers
# 12-4

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        output = self.sum(root, 0, 0)
        return output
    
    def sum(self, root, currentSum, output):
        if root:
            currentSum = currentSum * 10 + root.val
        else:
            return output
        if not root.left and not root.right:
            output += currentSum
        else:
            output = self.sum(root.left, currentSum, output)
            output = self.sum(root.right, currentSum, output)
        return output