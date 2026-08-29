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
    List<Integer> L = new ArrayList<>();
    public static void list(TreeNode root, List L){
        if (root == null) {
            return;
        }

        list(root.left, L);
        L.add(root.val);
        list(root.right, L);
    }
    public int minDiffInBST(TreeNode root) {
        list(root, L);
        Collections.sort(L);
        int first_P = L.get(0);
        int ans = L.get(1);
        for (int i = 1; i < L.size(); i++){

            int check = Math.abs(L.get(i - 1) - L.get(i));
            ans = Math.min(check, ans);
        }
        return ans;
    }
}