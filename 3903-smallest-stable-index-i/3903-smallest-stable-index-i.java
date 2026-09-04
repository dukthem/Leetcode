class Solution {
    public int firstStableIndex(int[] nums, int k) {
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int gre = Arrays.stream(nums, 0, i + 1).max().getAsInt();
            int sma = Arrays.stream(nums, i, nums.length).min().getAsInt();
            score.add(gre - sma);
        }
        System.out.println(score);
        int sma_score = Collections.min(score);
        if (sma_score <= k) {
            int index = 0;
            for (int i = 0; i < score.size(); i++) {
                if (score.get(i) <= k) {
                    index = i;
                    break;
                }
            }
            return index;
        }
        else {
            return -1;
        }
    }
}