class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    cnt = 1;
                }
                if (cnt == 1 && nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    cnt = 0;
                    break;
                }
            }
            if (cnt == 1){
                ans[i] = -1;
            }
        }
        return ans;
    }
}