class Solution {
    // using string builder first i will create a aplhabet having all the alphabets
        // then traverse in the "KEY" string and add the character to another SB.
        // and when adding check that the element is already in the SB or not. 
        // if there is then do not add that if it does not have that then add. 
        // further traverse the "MESSAGE" and at each character check at which possition of the key is character lies and when index is recieved then extract the character from alphabets at the same index.


    public String decodeMessage(String key, String message) {
        String space = key.replace(" ", ""); // Replaces the white spaces.
        // Now removing the dulplicates.
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : space.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set) {
            sb.append(c);
        }
        String latest = sb.toString();
        // latest is the real key now.
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder ansCode = new StringBuilder();
        for (char c : message.toCharArray()){
            if (c == ' '){
                ansCode.append(" ");
            } else{
                int index = latest.indexOf(c);
                ansCode.append(alpha.charAt(index));
            }
        }
        String ans = ansCode.toString();

        return ans;
    }
}