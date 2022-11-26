# 94. Binary Tree Inorder Traversal
# 11-26


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        list = []
        inorderHelper(root, list)
        return list


def inorderHelper(node, list):
    if node is None:
        return
    inorderHelper(node.left, list)
    list.append(node.val)
    inorderHelper(node.right, list)
