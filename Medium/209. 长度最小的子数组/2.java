class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    res = (j - i + 1) > res && res != 0 ? res : (j - i + 1);
                    break;
                }
            }
        }
        return res;
    }
}