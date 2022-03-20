class Solution {
    public int romanToInt(String s) {
        char ch = ' ';
        int number = 0;
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            if (i != 0 && ch == 'V' && s.charAt(i - 1) == 'I') {
                number = 4;
                i -= 1;
                sum += number;
            } else if (i != 0 && ch == 'X' && s.charAt(i - 1) == 'I') {
                number = 9;
                i -= 1;
                sum += number;
            } else if (i != 0 && ch == 'L' && s.charAt(i - 1) == 'X') {
                number = 40;
                i -= 1;
                sum += number;
            } else if (i != 0 && ch == 'C' && s.charAt(i - 1) == 'X') {
                number = 90;
                i -= 1;
                sum += number;
            } else if (i != 0 && ch == 'D' && s.charAt(i - 1) == 'C') {
                number = 400;
                i -= 1;
                sum += number;
            } else if (i != 0 && ch == 'M' && s.charAt(i - 1) == 'C') {
                number = 900;
                i -= 1;
                sum += number;
            } else {
                switch(ch) {
                    case 'I' :
                        number = 1;
                        break;
                    case 'V' :
                        number = 5;
                        break;
                    case 'X' :
                        number = 10;
                        break;
                    case 'L' :
                        number = 50;
                        break;
                    case 'C' :
                        number = 100;
                        break;
                    case 'D' :
                        number = 500;
                        break;
                    case 'M' :
                        number = 1000;
                        break;
                }
                sum += number;
            }
        }
        return sum;
    }
}