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
    public int minDepth(TreeNode root) {
        int level = 0;
        if (root == null) {
            return level;
        } else {
            level++;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            // level++;
            if (currNode == null) {
                // System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                    level++;
                    System.out.println("New Level?" + level);
                }
            } else {
                // level++;
                System.out.println(currNode.val + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                    // level++;
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                    // level++;
                }
                if (currNode.left != null && currNode.right != null) {
                    // level--;
                }
                if (currNode.left == null && currNode.right == null) {
                    break;
                }
                // break;
            }
        }
        return level;
    }
}