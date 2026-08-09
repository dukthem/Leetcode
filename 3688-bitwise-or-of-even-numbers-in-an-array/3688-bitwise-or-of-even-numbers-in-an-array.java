class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                s |= nums[i];
            }
        }
        return s;
    }
}