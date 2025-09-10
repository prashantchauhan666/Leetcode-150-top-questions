import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int h = 1;
        Arrays.sort(citations);
        int index = citations.length - 1;

        while (index >= 0) {
            if (citations[index] >= h) {
                h++;
            }
            if (citations[index] < h) {
                return h - 1;
            }
            index--;
            if (index < 0) {
                return h - 1;
            }
        }

        return 0;
    }
}
