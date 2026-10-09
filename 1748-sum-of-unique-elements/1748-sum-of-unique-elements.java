class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        int r = 0;
        for(int c : nums) {
            if(duplicate.contains(c)){
                continue;
            }
            if(seen.add(c)){
                r += c;
            } 
            else {
                r -= c;
                duplicate.add(c);
            }
        }
        return r;
    }
}