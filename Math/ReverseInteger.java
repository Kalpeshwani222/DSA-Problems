class ReverseInteger {
    public static int ReverseInteger(int no) {
        int ans = 0;
        int digit = 0;
        while (no != 0) {
            digit = no % 10; // 3
            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            ans = ans * 10 + digit;
            no = no / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int no = 123;
        int res = ReverseInteger(no);
        System.out.println(res);
    }
}