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
    List<Integer> nodes = new ArrayList<>();
    int sum = 0;
    int covered = 0;
    public void update(TreeNode root) {
        if (root == null) {
            return;
        }
        update(root.left);
        int curr = root.val;
        root.val = sum - covered;
        covered += curr;
        update(root.right);
    }
    public void elements(TreeNode root) {
        if (root == null) {
            return;
        }
        elements(root.left);
        nodes.add(root.val);
        elements(root.right);
    }
    public TreeNode bstToGst(TreeNode root) {
        elements(root);
        
        for (int i = 0; i < nodes.size(); i++) {
            sum += nodes.get(i);
        }
        update(root);
        // TreeNode curr = new TreeNode(nodes.get(0));
        // System.out.println(nodes);
        return root;
    }
}