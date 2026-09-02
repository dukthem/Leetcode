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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> L = new ArrayList<>();
        if (root == null) {
            return L;
        }
        q.add(root);
        int qlen = 0;
        while (q.size() > 0) {
            qlen = q.size();
            for (int i = 0; i < qlen; i++) {
                TreeNode curr = q.poll();
    // poll() method retrieves and removes the head (first element) of the queue, returning null if the queue is empty.
                System.out.println(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                if (i == qlen - 1) {
                    L.add(curr.val);
                }
            }
        }
        return L;
    }
}