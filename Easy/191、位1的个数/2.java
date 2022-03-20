public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int num = 0;
        int flag = 0;

        if (n < 0) {
            n = ~n;
            flag = 1;
        }
        System.out.println(n);
        for (int i = 1; i <= 32; i++) {
            if (n % 2 == 1) {
                num += 1;
            }
            n = n / 2;
        }
        if (flag == 1) {
            num = 32 - num;
        }
        return num;
    }
}