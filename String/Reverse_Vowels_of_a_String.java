class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String str) {
        char[] s = str.toCharArray();

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            if (!isVowel(s[start])) {
                start++;
                continue;
            }

            if (!isVowel(s[end])) {
                end--;
                continue;
            }

            // swap the values
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
        return String.valueOf(s);
    }

    public static boolean isVowel(char curr) {
        if (curr == 'a' || curr == 'A' || curr == 'e' || curr == 'E' || curr == 'i' || curr == 'I'
                || curr == 'o' || curr == 'O' || curr == 'u' || curr == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "hello";
        String res = reverseVowels(str);
        System.out.println(res);
    }
}
