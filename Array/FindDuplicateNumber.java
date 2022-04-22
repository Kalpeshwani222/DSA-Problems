import java.util.HashSet;
import java.util.Set;

class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 4, 2 };

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j] && (i != j)) {
        // System.out.println(arr[i]);
        // }
        // }
        // }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            boolean no = set.add(arr[i]);
            if (!no) {
                System.out.println(arr[i]);
            }
        }
    }
}
