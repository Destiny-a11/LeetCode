class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "";
        String s2 = "";
        s1 = method(s);
        s2 = method(t);
        return s1.equals(s2);
    }

    public static String method(String str) {
        String temp = "";
        int count = 0;
        boolean flag = true;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '#') {
                if (count > 0) {
                    count--;
                } else {
                    flag = false;
                }
                if (flag == false){
                    temp += str.charAt(i);
                }
            } else if (str.charAt(i) == '#'){
                count++;
                flag = true;
            }
        }
        return temp;
    }
}