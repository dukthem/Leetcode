class Solution {
    public int[] minCosts(int[] cost) {
        int[] arr = new int[cost.length];
        for (int i = 0; i < cost.length; i++) {
            if (i == 0) {
                arr[i] = cost[i];
            }
            if (i > 0){
                if (arr[i - 1] > cost[i]) {
                    arr[i] = cost[i];
                } else {
                    arr[i] = arr[i - 1];
                }
            }
        }
        return arr;
    }
}