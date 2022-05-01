import java.util.Arrays;

class AnagramString {
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
        }

        // char arr1[] = str1.toCharArray();
        // char arr2[] = str2.toCharArray();

        // // sort the arr
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // if (Arrays.equals(arr1, arr2)) {
        // System.out.println("It is anagram String");
        // }

        // sol -2

        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            // increament char count of str1 string
            arr[str1.charAt(i) - 'a']++;

            // decrement the count of the str2 string
            arr[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("Not anagram");
                break;
            }
        }

        System.out.println("anagram");
    }
}