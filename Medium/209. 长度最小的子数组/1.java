class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int slowIndex = 0;
        int fastIndex = 0;
        int sum = 0;
        int res = nums.length;
        boolean flag = true;

        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            sum += nums[fastIndex];

            while (sum >= target) {
                res = res < (fastIndex - slowIndex + 1) ? res : (fastIndex - slowIndex + 1);
                sum -= nums[slowIndex++];
                flag = false;
            }
        }
        return flag ? 0 : res;
    }
}