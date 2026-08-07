class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < nums[nums.length - 1]){
                while (nums[i] + 1 != nums[i+1]){
                    int j = 0;
                    ans.add(nums[i] + 1);
                    nums[i] = nums[i] + 1;
                    j += 1;
                }
            }
        }
        return ans;
    }
}