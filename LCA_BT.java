/*

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the  definition of LCA on Wikipedia : "The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself). ”

Given the following binary tree: root = [3,5,1,6,2,0,8,null,null,7,4]

        _______3______
       / \
    ___5__ ___1__
   / \ / \
   6 _2 0 8
         / \
         7 4
Example 1:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of of nodes 5and 1is3.
Example 2:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5and 4is 5, since a node can be a descendant of itself

*/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == q || root == p) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left != null && right != null) return root; //Either left or right is p or q. This root must be the lowest ancestor
        return left == null ? right:left; 
    }
}
