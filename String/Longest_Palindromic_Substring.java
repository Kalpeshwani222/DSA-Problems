// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.

// Input: s = "cbbd"
// Output: "bb"

class Longest_Palindromic_Substring {

    public static String longestPalindrome(String str) {
        if (str.length() <= 1)
            return str;

        int max_len = 1;
        int n = str.length();
        int start = 0, end = 0;

        // for odd string length
        for (int i = 0; i < n - 1; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n) {
                if (str.charAt(l) == str.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (len > max_len) {
                max_len = len;
                start = l + 1;
                end = r - 1;
            }
        }

        // for even string length
        for (int i = 0; i < str.length() - 1; i++) {
            int l = i, r = i + 1;

            while (l >= 0 && r < str.length()) {
                if (str.charAt(l) == str.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (len > max_len) {
                max_len = len;
                start = l + 1;
                end = r - 1;
            }
        }

        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String str = "babad";
        String res = longestPalindrome(str);
        System.out.println(res);
    }
}