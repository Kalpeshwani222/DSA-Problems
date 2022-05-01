class Palindrome {
    // public static boolean isPalindrome(String str) {
    // // 1st to convert all the string to the lowercase
    // str = str.toLowerCase();
    // StringBuilder sb = new StringBuilder();

    // // check the character is digit or letter then append it to the sb
    // for (int i = 0; i < str.length(); i++) {
    // if ((Character.isDigit(str.charAt(i)) ||
    // (Character.isLetter(str.charAt(i))))) {
    // sb.append(str.charAt(i));
    // }
    // }

    // // check if the 1st char and last character is same or not
    // // till the half length of the string
    // int n = sb.length() - 1;
    // for (int i = 0; i < sb.length() / 2; i++) {
    // if (sb.charAt(i) != sb.charAt(n - i))
    // return false;
    // }

    // return true;
    // }

    public static boolean isPalindrome(String str) {
        // base case condition
        if (str.length() <= 1)
            return true;

        int start = 0, end = str.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            }

            if (start < end && Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "a man, a plan, a canal; panama";
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
