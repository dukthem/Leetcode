class Solution {
    public int minOperations(int n) {
        int start = 1;
        int end = Math.abs(n/2);
        int m = 0;
        int sum = 0;

        while(m < end){
            sum = sum + (n - start);
            m++ ;
            start = start + 2;
       }
        return sum;
    }
}