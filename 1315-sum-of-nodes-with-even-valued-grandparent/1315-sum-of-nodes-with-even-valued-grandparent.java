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
    int ans = 0;
    int cnt = 0;
    public void add(TreeNode root) {
        // System.out.println(root.val);
        if (root == null){
            return;
        }
        System.out.println(root.val + " " + cnt);
        if (cnt == 2) {
            ans += root.val;
            System.out.println(root.val);  
            // cnt--;
            return;
        }
        cnt++;
        add(root.left);
        add(root.right);
        cnt--;
        

    }
    public void Node(TreeNode root) {
        if (root == null) {
            return;
        }
        if(root.val % 2 == 0) {
            // System.out.println(root.val + " " + cnt);
            add(root); // root node is all the even value node.
        }
        Node(root.left);
        Node(root.right);
    }
    public int sumEvenGrandparent(TreeNode root) {
        Node(root); // This function will traverse in the tree and check if the node is even
        return ans;    
    }
}