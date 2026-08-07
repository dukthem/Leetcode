class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int res = 0;
        String ans = "";
        for(int i = 0; i < words.length; i++) { // in this we consider each word
        int weight = 0;
            for(int j = 0; j < words[i].length(); j++){ // inthis we iterate each word
                char ch = words[i].charAt(j);
                for(int k = 0; k < 26; k++){// in this we get the weigth of each alphabet
                    if (ch == alphabet.charAt(k)){
                        weight += weights[k];
                    }
                }

            }
            // System.out.println(weight);
            res = weight % 26;
            // System.out.println(res);
            ans += alphabet.charAt(26-1-res);
        }
        return ans;
    }
}