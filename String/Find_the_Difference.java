import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Find_the_Difference {

    // public static char findTheDifference(String str1, String str2) {
    // Map<Character, Integer> map = new HashMap<>();

    // for (int i = 0; i < str1.length(); i++) {
    // char ch = str1.charAt(i);
    // map.put(ch, map.getOrDefault(ch, 0) + 1);
    // }

    // for (int i = 0; i < str2.length(); i++) {
    // char ch = str2.charAt(i);
    // if (map.containsKey(ch) && map.get(ch) > 0) {
    // map.put(ch, map.get(ch) - 1);
    // } else {
    // return ch;
    // }
    // }
    // return ' ';

    // }

    public static char findTheDifference(String str1, String str2) {
        char c = 0;
        for (char curr : str1.toCharArray()) {
            c = (char) (c ^ curr);
        }

        for (char curr : str2.toCharArray()) {
            c = (char) (c ^ curr);
        }
        return c;
    }

    public static void main(String[] args) {
        String str1 = "abcd", str2 = "abcde";
        char res = findTheDifference(str1, str2);
        System.out.println(res);
    }
}
