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
0 is false
1 is true
2 is OR
3 is AND
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) { // This is for the leaf node;
            return root.val == 1;
        } 
        if(root.val == 2) {
            return (evaluateTree(root.left) | evaluateTree(root.right));
        } else {
            return (evaluateTree(root.left) & evaluateTree(root.right));
        }

    }
}