// TC: O(N*M) & SC:O(1)
class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++){
            int cnt2 = 0;
            for(int j = 0; j < words[i].length(); j++){
                if (j < pref.length() && pref.charAt(j) == words[i].charAt(j)){
                    cnt2 += 1;
                }
            }
            if (cnt2 == pref.length()){
                cnt += 1;
            }
        }
        return cnt;
    }
}