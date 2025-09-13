class Solution {
    public boolean hasZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        // Calculate product of non-zero numbers and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        int[] result = new int[nums.length];

        
        if (zeroCount > 1) {
            return result; 
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                result[i] = product / nums[i];
            } else { 
                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            }
        }

        return result;
    }
}