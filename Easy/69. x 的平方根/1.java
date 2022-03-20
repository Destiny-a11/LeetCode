class Solution {
    public int mySqrt(int x) {
        int mid = 0;
        long result = 0L;
        long low = 0L;
        long high = x;
        while (low <= high) {
            result = (high - low) / 2 + low;
            if ((long)(result * result) > x) {
                high = result - 1;
            } else if ((long)(result * result) < x) {
                low = result + 1;
                mid = (int)result;
            } else {
                return (int)result;
            }
        }
        return mid;
    }
}