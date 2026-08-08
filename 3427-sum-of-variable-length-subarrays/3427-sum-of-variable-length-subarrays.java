class Solution {
    public int subarraySum(int[] nums) {
       int ans = 0;  // this is the actual answer
       int sum = 0;  // this is the sum of the subarry answer
    //    int[] arr = new int[]; // this is for the subarray
       for(int i = 0; i < nums.length; i++) {
        int start = Math.max(0, i - nums[i]);
        for (int j = start; j <= i; j++) {
            sum += nums[j];
        }
        ans += sum;
        sum = 0;
       }
        return ans;

    }
}