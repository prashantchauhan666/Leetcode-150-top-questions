class Solution {
    public int removeElement(int[] array, int targetValue) {
        int validCount = 0;
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] != targetValue) {
                array[validCount] = array[currentIndex];
                validCount++;
            }
        }
        return validCount;
    }
}
