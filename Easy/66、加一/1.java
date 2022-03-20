class Solution {
    public int[] plusOne(int[] digits) {

        //第一种寻找哪一位不等于9
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) { //不等于9的那一位加一
                digits[i] += 1;
                for (int j = i + 1; j < digits.length; j++) { //等于9的低位置0
                    digits[j] = 0;
                }
                return digits; 
            }
        }

        //第二种所有元素都为9，需要数组扩容
        int[] digitsNew = new int[digits.length + 1];
        digitsNew[0] = 1;
        return digitsNew;
    }
}