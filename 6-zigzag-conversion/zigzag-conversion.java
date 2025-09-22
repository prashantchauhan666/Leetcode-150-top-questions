class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            rows[i] = new StringBuilder();
        }

        int m = 0;            
        boolean flag = false; 

        for (char c : s.toCharArray()) {
            rows[m].append(c);

            if (m == 0 || m == n - 1) {
                flag = !flag;
            }

            if (flag) {
                m = m + 1;  
            } else {
                m = m - 1;  
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}