class AdditonOfTwoString {

    public static String AdditonOfTwoString(String str1, String str2) {

        String res = "";
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) { // carry != 0 this conditon can be work on single no's
            int ival = i >= 0 ? str1.charAt(i) - '0' : 0;
            int jval = j >= 0 ? str2.charAt(j) - '0' : 0;

            i--;
            j--;

            int sum = ival + jval + carry;
            res = (sum % 10) + res;
            carry = sum / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "34";
        String res = AdditonOfTwoString(str1, str2);
        System.out.println(res);

    }
}
