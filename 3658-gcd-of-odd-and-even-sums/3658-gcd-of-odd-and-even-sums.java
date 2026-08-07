class Solution {
    public static int gcd(int sumod, int sumev){
        while (sumev != 0){
            int temp = sumev;
            sumev = sumod % sumev;
            sumod = temp;
        }
        return sumod;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumod = 0;
        int sumev = 0;
        if (n % 2 == 0){
            sumod = (n/2)*(2 + ((n-1)*2));
            sumev = (n/2)*(4 + ((n-1)*2));
        } else {
            sumod = (n)*((2 + ((n-1)*2))/2);
            sumev = (n)*((4 + ((n-1)*2))/2);
        }
        int ans = gcd(sumod, sumev);
        System.out.println(sumod + " " + sumev);
        return ans;
    }
    
}