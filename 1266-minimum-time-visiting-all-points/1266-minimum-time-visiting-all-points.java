// TC: O(N) SC: O(1)
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length; i++) {
            int x = 0;
            int y = 0;
            if (i + 1 < points.length){
                x = points[i][0] - points[i+1][0];
                y = points[i][1] - points[i+1][1];
                System.out.println(x);
                System.out.println(y);
                if (x < 0){
                    x = x * -1;
                } 
                if (y < 0){
                    y = y * -1;
                }
                int m = Math.max(x , y);
                System.out.println(m);
                ans += m;
            }
            
        }
        return ans;
    }
}