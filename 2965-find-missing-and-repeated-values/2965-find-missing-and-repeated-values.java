class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l = grid.length;
        int[] nums = new int[l*l];
        int h = 0;
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < l; j++) {
                nums[h] = grid[i][j];
                h++;
            }
        }
        Arrays.sort(nums);
        int[] ans = new int[2];
        // int ref = 1;
        if (nums[0] != 1) {
            ans[1] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                ans[0] = nums[i]; // Found duplicate
            } else if (nums[i] - nums[i - 1] > 1) {
                ans[1] = nums[i - 1] + 1; // Found missing number in between
            }
        }
        if (ans[1] == 0) {
            ans[1] = nums.length;
        }
        // for(int i = 0; i < nums.length; i++) {
        //     if (nums[i] == ref) {
        //         ref++;
        //         continue;
        //     } else {
        //         if (nums[i] == nums[i-1]){
        //             ans[0] = nums[i];
        //             if (i < nums.length - 1){
        //                 ans[1] = nums.length;
        //             }
        //         } else {
        //             ans[1] = nums[i] - 1;
        //             ref += 2;
        //         }
        //         // if (i == nums.length - 1 && ans[1] == 0){
        //         //     ans[1] = l;
        //         // }
        //     }
        // }
        return ans;

    }
}