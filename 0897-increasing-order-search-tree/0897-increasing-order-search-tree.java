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
    int i = 1;
    public void element(TreeNode root) {
        if (root == null) {
            return;
        }
        element(root.left);
        nodes.add(root.val);
        element(root.right);
    }
    public void build(TreeNode ans) {
        if (i == nodes.size()){
            return;
        }
        TreeNode curr = new TreeNode(nodes.get(i));
        ans.right = curr;
        i++;
        build(ans.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        element(root);
        TreeNode ans = new TreeNode(nodes.get(0));
        build(ans);
        System.out.println(nodes);
        return ans;
    }
}