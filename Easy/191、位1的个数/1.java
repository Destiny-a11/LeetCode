public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int num = 0;
        n = ~n + 1;
        System.out.println(n);
        for (int i = 1; i <= 32; i++) {
            if (n % 2 == 1) {
                num += 1;
            }
            n = n / 2;
        }
        return num;
    }
}