class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int leftIndex = nums.length;
        int rightIndex = nums.length;
        

        if (nums.length == 0) {
            return 0;
        }

        while (low <= high) {
            mid = (low + high) / 2;

            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target <= nums[mid]) {
                high = mid - 1;
                leftIndex = mid;
            }
        }
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (target >= nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
                rightIndex = mid;
            }
        }

        return rightIndex - leftIndex;
    }
}