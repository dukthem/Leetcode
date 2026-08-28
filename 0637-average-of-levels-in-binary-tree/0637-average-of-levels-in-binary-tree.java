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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Double> ans = new ArrayList<>();
        Double Sum = 0.0;
        Double cnt = 0.0;
        while(!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if (currNode == null) {
                if (q.isEmpty()) {
                    ans.add(Sum/cnt);
                    //  System.out.println(Sum/cnt);
                    // System.out.println(" Level ");
                    break;
                } else {
                    ans.add(Sum/cnt);
                    // System.out.println(Sum/cnt);
                    // System.out.println(" Level ");
                    Sum = 0.0;
                    cnt = 0.0;
                    q.add(null);
                }
            } else {
                System.out.println(currNode.val);
                Sum += currNode.val;
                cnt++;
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return ans;
    }
}