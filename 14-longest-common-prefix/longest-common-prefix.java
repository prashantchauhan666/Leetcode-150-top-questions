
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // ✅ step 1: assume first string as prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { 
                prefix = prefix.substring(0, prefix.length() - 1); // \U0001f504 shrink prefix
                if (prefix.isEmpty()) return ""; // ⛔ agar empty ho gaya toh no prefix
            }
        }
        return prefix; 
            }
}