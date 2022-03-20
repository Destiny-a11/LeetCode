class Solution {
    public String addBinary(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int n = 0;
        int sum = 0;

        int index = a.length() > b.length() ? b.length() : a.length();
        for (int i = 0; i <= index && Math.max(aInt,bInt) != 0; i++) {
            n = aInt % 10 + bInt % 10;
            if (i == 0 && n == 2) {
                sum = 10;
            } else if (n == 2){
                sum = sum + sum * 10; 
            }

            if (n == 1 || n == 0) {
                if (sum == 0) {
                    sum += n * Math.pow(10,i);
                } else {
                    sum *= n * Math.pow(10,i);
                }
                
            }
            aInt /= 10;
            bInt /= 10;
        }

        return sum + "";
    }
}