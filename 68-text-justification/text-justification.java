class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> internal = new ArrayList<>();
        int curr = 0;
        for (int i = 0; i < words.length; i++) {
            if (curr + words[i].length() <= maxWidth) {
                internal.add(words[i]);
                curr += words[i].length() + 1;
            } else {
                curr -= 1;
                int extra = maxWidth - curr;
                int space_bet = internal.size() - 1;
                int rem = 0;
                int q = 0;
                if (space_bet != 0) {
                    q = extra / space_bet;
                    rem = extra % space_bet;
                } else {
                    String spaces = " ".repeat(extra);
                    internal.set(0, internal.get(0) + spaces);
                }
                int ind = 0;
                while (ind < internal.size() - 1) {
                    int totalSpaces = q + (rem > 0 ? 1 : 0);
                    String spaces = " ".repeat(totalSpaces + 1);
                    internal.set(ind, internal.get(ind) + spaces);
                    rem -= 1;
                    ind += 1;
                }
                res.add(String.join("", internal));
                internal = new ArrayList<>();
                internal.add(words[i]);
                curr = words[i].length() + 1;
            }
        }
        if (internal.size() > 0) {
            String last_val = String.join(" ", internal);
            int extra = maxWidth - last_val.length();
            res.add(last_val + " ".repeat(extra));
        }
        return res;
    }
}