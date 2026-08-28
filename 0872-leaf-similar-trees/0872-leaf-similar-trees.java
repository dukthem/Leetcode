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
    
    public List<Integer> inorder(TreeNode root, List L){
        if (root == null) {
            return L;
        }
        if (root.left == null && root.right == null) {
            L.add(root.val);
        }
        inorder(root.left, L);
        inorder(root.right, L);
        return L;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();
        List r1 = inorder(root1, L1);
        List r2 = inorder(root2, L2);
        System.out.println(r1);
        System.out.println(r2);
        if (r1.size() != r2.size()) {
            System.out.println("Size is not the same");
            return false;
        } else {
            for(int i = 0; i < r1.size(); i++) {
                if(!r1.get(i).equals(r2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }
}