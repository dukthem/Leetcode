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
    int sum = 0;
    int cntOfNodes = 0;
    int ans = 0;
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        sum += root.val;
        cntOfNodes++;
        traverse(root.left);
        traverse(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        if (root == null){
            return ans;
        }
        
        traverse(root);
        System.out.println(sum/cntOfNodes);
        if (sum/cntOfNodes == root.val) {
            ans++;
        }
        sum = 0;
        cntOfNodes = 0; 
        // traverse(root);
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }
}