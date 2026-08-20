class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder arr = new StringBuilder();
        int first = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                last = i;
                for (int j = last - 1; j > first-1; j--) {
                    arr.append(s.charAt(j));
                }
                arr.append(' ');
                first = last + 1;
            } if (i == s.length() - 1) {
                last = i;
                for (int j = last; j > first-1; j--) {
                    arr.append(s.charAt(j));
                }
                // arr.append(' ');
                first = last + 1;
            }
        }
        String ans = arr.toString();
        return ans;
    }
}