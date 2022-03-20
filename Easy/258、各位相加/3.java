class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int flag = 0;
        if (num < 10) {
            return num;
        } else {
            while (sum >= 10 || flag == 0) {
                if (flag == 1) {
                    num = sum;
                    sum = 0;
                }
                while (num != 0) { //当num不为一位数时就循环取低位
                    sum += num % 10; //将每次的低位加起来
                    num /= 10;  //将低位舍去
                    flag = 1;
                } 
            }
        }
        return sum;
    }
}