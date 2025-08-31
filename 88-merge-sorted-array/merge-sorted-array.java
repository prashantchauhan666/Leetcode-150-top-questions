class Solution {
    public void merge(int[] firstArray, int firstLength, int[] secondArray, int secondLength) {
        int indexFirst = firstLength - 1;
        int indexSecond = secondLength - 1;
        int mergeIndex = firstLength + secondLength - 1;

        while (indexFirst >= 0 && indexSecond >= 0) {
            if (firstArray[indexFirst] > secondArray[indexSecond]) {
                firstArray[mergeIndex--] = firstArray[indexFirst--];
            } else {
                firstArray[mergeIndex--] = secondArray[indexSecond--];
            }
        }

        while (indexSecond >= 0) {
            firstArray[mergeIndex--] = secondArray[indexSecond--];
        }
    }
}
