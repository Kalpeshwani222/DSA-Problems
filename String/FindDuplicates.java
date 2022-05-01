import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindDuplicates {

    // public static void solution1(String str) {
    // Set set = new HashSet<>();

    // for (int i = 0; i < str.length(); i++) {
    // if (!set.add(str.charAt(i))) {
    // System.out.println(str.charAt(i));
    // }
    // }
    // }

    public static void solution2(String str) {
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                System.out.println(charArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Kalpeshh";

        // solution1(str);
        solution2(str);

    }
}
