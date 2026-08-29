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
    public static void list(TreeNode root, List L) {
        if (root == null){
            return;
        }
        list(root.left, L);
        L.add(root.val);
        list(root.right, L);
    }
    public int findSecondMinimumValue(TreeNode root) {
        list(root, L);
        Collections.sort(L);
        System.out.println(L);
        int smallest = L.get(0);
        int Second_smallest = L.get(0);
        for (int i = 0; i < L.size(); i++){
            if (smallest != L.get(i)){
                Second_smallest = L.get(i);
                break;
            }
        }
        if (smallest == Second_smallest){
            return -1;
        }
        else{
            return Second_smallest;
        }
        // return smallest;
    }
}