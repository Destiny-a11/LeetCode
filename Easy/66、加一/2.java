class Solution {
    public int[] plusOne(int[] digits) {
        int i = 1;
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
        } else {
            while (digits.length - i >= 0 && digits[digits.length - i] == 9) {
                if (digits.length - i == 0) {
                    int[] digit2 = new int[digits.length + 1];
                    for (int j = 0; j < digits.length; j++) {
                        digit2[j +1] = 0;
                    }
                    digit2[0] = 1;
                    return digit2;
                } else {
                    digits[digits.length - i] = 0;
                    i++;
                }
            }
            if (digits.length - i >= 0) {
                digits[digits.length - i] += 1;
            }
        }
        return digits;
    }
}