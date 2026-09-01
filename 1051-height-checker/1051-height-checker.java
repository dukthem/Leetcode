class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        // System.out.println(expected);
        // System.out.println(heights);
        int cnt = 0;
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != expected[i]) {
                cnt++;
            }
        }
        return cnt;

    }
}