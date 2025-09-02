class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueCount = 1; // first element is always unique
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != arr[uniqueCount - 1]) {
                arr[uniqueCount] = arr[index]; // place unique element
                uniqueCount++;
            }
        }
        return uniqueCount; // return number of unique elements
    }
}
