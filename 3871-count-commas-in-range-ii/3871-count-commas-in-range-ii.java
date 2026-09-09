class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long length = String.valueOf(Math.abs(n)).length();
        long multiple = 0;
        if (length % 3 == 0) {
            multiple = (length / 3) - 1;
        } else {
            multiple = length / 3;
        }
        if (multiple >= 1) {
            long small = 1000;
            long large = 999999;
            for (long i = 1; i <= multiple; i++) {
                if (i != multiple) {
                    ans += (large - small + 1) * i;
                } else {
                    ans += (n - small + 1) * i;
                }
                small *= 1000;
                large = (small * 1000) - 1;
            }
            return ans;
        } else {
            return ans;
        }
        

    }
}