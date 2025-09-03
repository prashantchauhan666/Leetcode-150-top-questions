class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPos = 2;
        for (int current = 2; current < nums.length; current++) {
            if (nums[insertPos - 2] != nums[current]) {
                nums[insertPos] = nums[current];
                insertPos++;
            }
        }
        return insertPos;
    }
}

