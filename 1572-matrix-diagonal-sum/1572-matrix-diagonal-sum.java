class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int l = mat.length;
        if (l == 1){
            ans = mat[0][0];
        } else if (l % 2 != 0){
            for (int i = 0; i < l; i++){
                ans += mat[i][i];
                ans += mat[i][l-1-i];
            }
            int mid = (1 + l) / 2;
            ans -= mat[mid-1][mid-1];
        } else {
            for (int i = 0; i < l; i++){
                ans += mat[i][i];
                ans += mat[i][l-1-i];
            }
            }
        return ans;
    }
}