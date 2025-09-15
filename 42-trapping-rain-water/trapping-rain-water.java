class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int lm = 0;
        int rm = 0;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > lm) {
                    lm = height[left];

                } else {
                    result += lm - height[left];
                }
                left++;
            } else {
                if (height[right] > rm) {
                    rm = height[right];

                } else
                    result += rm - height[right];
                right--;
            }

        }
        return result;
    }
}