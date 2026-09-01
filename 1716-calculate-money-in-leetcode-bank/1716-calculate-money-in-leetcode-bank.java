class Solution {
    public int totalMoney(int n) {
        // int week = 7 * 4;
        int noOfWeek = n / 7;
        int ans = 0;
        if (noOfWeek > 0){
            // ans += (7 * (noOfWeek + 3));
            for (int i = 4; i < noOfWeek + 4; i++) {
                ans += (7 * i);
            }
        }
        System.out.println(ans);
        if ((n % 7) != 0) {
            int steps = (n % 7);
            int start = (noOfWeek) + 1;
            ans += (steps * ((2 * start) + (steps - 1) * 1)) / 2;
            // System.out.println(end);
            // for (int i = (noOfWeek) + 1; i < (n % 7) + 1; i++){
            //     ans += i;
            //     System.out.println(ans);
            // }
        }
        
        
        
        // System.out.println(2 + 3 + 4 + 5 + 6 + 7 + 8);
        return ans;
    }
}