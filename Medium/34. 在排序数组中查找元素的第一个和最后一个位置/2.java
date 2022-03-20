class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        if (nums.length == 0) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        
        arr[0] = nums.length - 1;
        arr[1] = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
                arr[0] = mid;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
                arr[1] = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (nums[arr[0]] == target && nums[arr[1]] == target) {
            return arr;
        } else {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

    }
}