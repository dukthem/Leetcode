// TC: O(N) SC: O(1)
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        } else { 
            HashSet<Character> alpha = new HashSet<>();
            for(int i = 0; i < sentence.length(); i++){
                alpha.add(sentence.charAt(i));
            }
            if (alpha.size() == 26){
                return true;
            } else{
                return false;
            }

        }
    }
}