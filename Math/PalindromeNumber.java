public class PalindromeNumber {

    public static boolean PalindromeNumber(int no) {
        int temp = no;
        int digit = 0;
        int res = 0;

        if (no < 0) {
            return false;
        }
        // 121
        while (no != 0) {
            digit = no % 10; // 1
            no = no / 10; // 12
            res = res * 10 + digit;
        }
        if (temp == res) {
            return true;
        }

        return false;
    }

    // public static boolean PalindromeNumber(int x) {

    // String s = String.valueOf(x);

    // char[] c1 = s.toCharArray();

    // int r = c1.length - 1;

    // int f = 0;

    // while (f < c1.length / 2 && r >= c1.length / 2) {
    // if (c1[f] != c1[r]) {
    // return false;
    // }
    // f++;
    // r--;
    // }
    // return true;
    // }

    public static void main(String[] args) {
        int no = 121;
        boolean res = PalindromeNumber(no);
        System.out.println(res);
    }
}
