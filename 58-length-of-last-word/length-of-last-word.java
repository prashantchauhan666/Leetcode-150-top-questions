class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int c = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            c++;
            i--;
        }

        System.out.println("The last word is \"" + s.substring(i + 1) + "\" with length " + c);
        return c;
    }
}