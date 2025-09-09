 class Solution {
     public int jump(int[] nums) {
         int jumps = 0, currentEnd = 0;
         int n = nums.length;
         int farthest = 0;
         for(int i=0;i<n-1;i++)
         {
             farthest = Math.max(farthest,nums[i] + i);

             if(i == currentEnd)
             {
                 jumps++;
                 currentEnd = farthest;
             }
         }
         return jumps;
     }
 }