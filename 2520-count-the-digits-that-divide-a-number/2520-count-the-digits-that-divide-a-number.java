// TC: O(Len(num)) & SC: O(1)
class Solution {
    public int countDigits(int num) {
        int digit = 0;
        int ans = 0;
        int temp = num;
        while (num != 0){
            digit = num % 10;
            if (temp % digit == 0){
                ans += 1;
                System.out.println(digit);
                System.out.println(num);
            }
            digit = 0;
            num /= 10;
        }
        return ans;
    }
}