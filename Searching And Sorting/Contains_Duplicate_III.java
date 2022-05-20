import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] arr, int k, int t) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>(n);

        if (t == 0 && n == set.size())
            return false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs((long) arr[i] - (long) arr[j]) <= t && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -2147483648, 2147483647 };

        int t = 1, k = 1;
        boolean res = containsNearbyAlmostDuplicate(arr, k, t);
        System.out.println(res);
    }
}