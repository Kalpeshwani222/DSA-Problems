class Reverse_str {

    public static void reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            right--;
            left++;
        }

        for (char c : str) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        char str[] = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(str);
    }
}