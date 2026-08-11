// TC:O(N) SC:O(1)
class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int last = 0;
        for (int i = 0; i < gain.length; i++){
            int curr = last + gain[i];
            System.out.println(curr);
            System.out.println(last);
            ans = Math.max(curr, ans);
            System.out.println(ans);
            last = curr;
        }
        return ans;
    }
}