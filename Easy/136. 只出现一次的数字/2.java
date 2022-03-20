class Solution {
    public int singleNumber(int[] nums) {
        int index = -2;
        for (int i = 0; i < nums.length; i++) {
            index = -2;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    index = -1;
                    continue;
                }
            }
            if (index == -2){
                index = i;
                return nums[i];
            }
        }
        return nums[index];
    }
}