class Solution {
    public int digitFrequencyScore(int n) {
        // int[][] freq = {{0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}};
        // while (n > 0){
        //     int digit = n % 10;
        //     for(int i = 0; i < 10; i++){
        //         if (digit == freq[i][0]){
        //             freq[i][1] += 1;
        //         }
        //     }
        //     n =  n / 10;
        // }
        // int ans = 0;
        // for(int i = 0; i < 10; i++){
        //     ans += (freq[i][0] * freq[i][1]);
        // }
        // return ans;
         
    int[] freq = new int[10]; // Direct indexing by digit value
    int original = n; // If you need the digit sum
    
    while (n > 0) {
        int digit = n % 10;
        freq[digit]++; // O(1) direct update, no inner loop needed
        n /= 10;
    }
    
    int ans = 0;
    for (int digit = 0; digit < 10; digit++) {
        ans += digit * freq[digit];
    }
    return ans;

    }
}