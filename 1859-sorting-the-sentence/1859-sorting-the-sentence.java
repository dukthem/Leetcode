class Solution {
    public String sortSentence(String s) {
        int num = 1;
        // String ans = "";
        StringBuilder sb = new StringBuilder();
        int ind = s.indexOf(String.valueOf(1));
        while (ind != -1) {
            // ind = s.indexOf(String.valueOf(num));
            // String rev = "";
            int start = 0;
            for (int i = ind - 1; i >= 0; i--) {
                if (s.charAt(i) == ' '){
                    start = i;
                    break;
                }
                if (i == 0) {
                    start = -1;
                }
            }
            // System.out.println(start + " " + ind + " " + num);
            sb.append(s, start+1, ind);
            sb.append(" ");
            // System.out.println(sb);
            num++;
            ind = s.indexOf(String.valueOf(num));
        }
        String ans = sb.substring(0, sb.length() - 1);
        // String ans = sb.toString();
        return ans;
    }
}