// TC: O(N*M) SC:O(1)
class Solution {
    public int[] findDegrees(int[][] matrix) {
        // List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int[] ans = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            int cnt = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}