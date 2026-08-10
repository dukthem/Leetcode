class Solution {
    public int countPartitions(int[] nums) {
        int l = 0;
        int r = 0;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length; j++){
                if (j <= i){
                    l += nums[j];
                } else{
                    r += nums[j];
                }
            }
            int sum = l - r;
            if (sum % 2 == 0){
                ans += 1;
            }
            sum = 0;
            l = 0;
            r = 0;
        }
        return ans;
    }
}