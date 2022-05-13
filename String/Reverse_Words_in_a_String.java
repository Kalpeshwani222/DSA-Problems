import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Reverse_Words_in_a_String {

    // public static String reverseWords(String str) {
    // StringBuilder result = new StringBuilder();

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == ' ') {
    // continue;
    // }
    // int start = i;

    // while (i < str.length() && str.charAt(i) != ' ') {
    // i++;
    // }

    // if (result.length() == 0) {
    // result.insert(0, str.substring(start, i));
    // } else {
    // result.insert(0, " ").insert(0, str.substring(start, i));
    // }
    // }
    // return result.toString();
    // }

    public static String reverseWords(String str) {
        String words[] = str.trim().split(" +");
        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        String res = reverseWords(str);
        System.out.println(res);
    }
}
