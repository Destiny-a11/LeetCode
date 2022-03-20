class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int leftIndex = method(nums, target, true);
        int rightIndex = method(nums, target, false);

        if (leftIndex != -1 && rightIndex != -1 && nums[leftIndex] == target && nums[rightIndex] == target) {
            int[] arr = {leftIndex, rightIndex};
            return arr;
        } else {
            int[] arr1 = {-1, -1};
            return arr1;
        }

    }

    public static int method(int[] nums,int target, boolean flag) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int arr = nums.length - 1;

        while (left <= right) {
            mid = (left + right) / 2;

            if (target < nums[mid] || (flag && target <= nums[mid])) {
                right = mid - 1;
                if (flag) {
                    arr = mid;
                } else {
                    arr = mid - 1;
                }
                
            } else {
                left = mid + 1;
            }
        }
        return arr;
    }
}