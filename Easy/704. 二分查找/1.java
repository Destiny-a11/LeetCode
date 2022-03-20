class Solution {
    public int search(int[] nums, int target) {
        
        //二分法查找
            int low;
            int high;
            int mid;
            low = 0;
            high = nums.length - 1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (target < nums[mid]) {
                    high = mid - 1;
                } else if (target > nums[mid]) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;

    }
}