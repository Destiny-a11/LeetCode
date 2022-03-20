class Solution {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        int fastIndex = 0;

        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (fastIndex == nums.length - 1 || !(nums[fastIndex] == nums[fastIndex + 1])) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}