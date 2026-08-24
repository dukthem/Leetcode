class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] ans = new int[row][col]; 
        
        for (int i = 0; i < row; i++) {
            int k = 0;
            for (int j = col - 1; j >= 0; j--) {
                ans[i][k] = image[i][j] ^ 1; 
                k++;
            }
        }
        return ans; 
    }
}