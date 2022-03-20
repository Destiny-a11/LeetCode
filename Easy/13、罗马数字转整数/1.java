class Solution {
    public int romanToInt(String s) {
        char[] ch = {' ', ' '};
        int[] number = {0, 0};
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            ch[0] = s.charAt(i);
            if (i != 0) {
                ch[1] = s.charAt(i - 1);
            }
            for (int j = 0; j < 2; j++) {
                switch(ch[j]) {
                    case 'I' :
                        number[j] = 1;
                        break;
                    case 'V' :
                        number[j] = 5;
                        break;
                    case 'X' :
                        number[j] = 10;
                        break;
                    case 'L' :
                        number[j] = 50;
                        break;
                    case 'C' :
                        number[j] = 100;
                        break;
                    case 'D' :
                        number[j] = 500;
                        break;
                    case 'M' :
                        number[j] = 1000;
                        break;
                }
            }
            if (i != 0 && number[1] < number[0]) {
                number[1] = - number[1];
                sum += number[0] + number[1];
                i = i - 1;
            } else {
                sum += number[0];
            }
        }
        return sum;
    }
}