class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        int r1 = Character.getNumericValue(s.charAt(1));
        int r2 = Character.getNumericValue(s.charAt(4));
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int start = 0;
        int end = 0;
        for (int i = 0; i < 26; i++) {
            if (s.charAt(0) == alpha.charAt(i)) {
                start = i;
            }
            if (s.charAt(3) == alpha.charAt(i)) {
                end = i;
            }
        }
        // System.out.println(start);
        // System.out.println(end-start+1);
        int h = end-start+1;
        for (int i = 0; i < h; i++) {
            int n = r1;
            // System.out.println(start);
            for (int j = 0; j < (r2 - r1 + 1); j++) {
                String con = String.valueOf(n);
                ans.add(alpha.charAt(start) + con);
                n++; 
                // System.out.println(start);
            }
            start++;
        }
        return ans;
    }
}