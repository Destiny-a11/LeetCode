public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long res = 0L;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                //if (i != 0) {
                    res += Math.pow(2,31 - i);
                //}
            }
        }
        return (int)res;
    }
}