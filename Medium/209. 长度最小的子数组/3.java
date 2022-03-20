class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int slowIndex = 0;
        int fastIndex = 0;
        int sum = 0;
        int res = 0;
        
        while (slowIndex < nums.length - 1){
            while (sum < target && fastIndex < nums.length) {
                sum += nums[fastIndex++];
            } 
            while (sum >= target && slowIndex < nums.length) {
                res = res < (fastIndex - slowIndex) && res != 0 ? res : (fastIndex - slowIndex);
                sum -= nums[slowIndex++];
            }

            if (sum < target && fastIndex >= nums.length) {
                break;
            }

            if (res == 1) {
                break;
            }
        }
       return res;
    }
}