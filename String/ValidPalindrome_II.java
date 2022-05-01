//e.g 
//  1. "aba"
//  -> True (its reverse string is same as orignal string)

//  2. "abca" 
//  -> True ( a b c a in this string to delete the b or c then this string is ValidPalindrome)

class ValidPalindrome_II {

    public static boolean ValidPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        int count1 = 0;
        int count2 = 0;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                start++;
                count1++;
            }
        }

        start = 0;
        end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                end--;
                count2++;
            }
        }

        if (count1 == 1 || count2 == 1)
            return true;
        if (count1 == 0 || count2 == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        String str = "abca";
        boolean res = ValidPalindrome(str);
        System.out.println(res);
    }
}
