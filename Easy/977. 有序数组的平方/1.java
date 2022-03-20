class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            int resi = nums[i] * nums[i];
            int resj = nums[j] * nums[j]; 
            if (resi > resj) {
                res[k--] = resi;
                i++;
            } else {
                res[k--] = resj;
                j--;
            }
        }
        return res;
    }
}