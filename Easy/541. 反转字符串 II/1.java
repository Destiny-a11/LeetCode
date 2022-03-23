class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] temp = new char[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            temp[i] = s.charAt(i);
        }

        if (n % (2 * k) >= k) { //剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
            int i = num; //4
            while (num < n) {
                for (i = num; i < (num + k / 2); i++) { //i = 4; i < 5
                    char t = temp[i]; //
                    temp[i] = temp[num + num + k - i - 1]; //
                    temp[num + num + k - i - 1] = t; 
                }
                num += 2 * k; // 4
            }
        } else { //剩余字符少于 k 个，则将剩余字符全部反转。
            int i = num;
            while (num < ((n / (2 * k)) * (2 * k))) {
                for (i = num; i < (num + k / 2); i++) {
                    char t = temp[i];
                    temp[i] = temp[num + num + k - 1 - i];
                    temp[num + num + k - 1 - i] = t;
                }
                num += 2 * k;
            }
            for (int j = ((n / (2 * k)) * (2 * k)); j < ((n / (2 * k)) * (2 * k)) + (n - ((n / (2 * k)) * (2 * k))) / 2; j++) {
                char t = temp[j];
                temp[j] = temp[n - 1 - j + ((n / (2 * k)) * (2 * k))];
                temp[n - 1 - j + ((n / (2 * k)) * (2 * k))] = t;
            }
        }
        String res= "";
        for (int i = 0; i < n; i++) {
            res += temp[i] + ""; 
        }
        return res;
    }
}