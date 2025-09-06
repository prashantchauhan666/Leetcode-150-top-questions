class Solution {
    public void rotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;
        reverseArray(arr, 0, length - steps - 1);
        reverseArray(arr, length - steps, length - 1);
        reverseArray(arr, 0, length - 1);
    }

    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
