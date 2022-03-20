class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int count = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                break;
            }
        }
        int newMid = mid - 1;
        while (mid < nums.length && target == nums[mid] ) {
            mid++;
            count++;
        }

        while (newMid >= 0 && target == nums[newMid]) {
            newMid--;
            count++;
        }
        return count;
    }
}