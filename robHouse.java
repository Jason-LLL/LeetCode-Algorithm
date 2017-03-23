public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int now  = 0;
        int last = 0;
        
        for (int i=0; i<nums.length; i++) {
            int temp = last;
            last = now;
            now  = Math.max(now,nums[i]+temp);
        }
        return now;
    }
}