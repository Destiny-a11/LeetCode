class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;

        while (low <= high) {
            long mid = (high - low) / 2 + low;
            long square = mid * mid;
            if (square < num) {
                low = (int)mid + 1;
            } else if (square > num ) {
                high = (int)mid - 1;
            } else {
                return true;
            }  
        }
        return false;
    }
}