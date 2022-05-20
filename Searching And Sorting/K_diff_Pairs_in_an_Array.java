import java.util.HashMap;
import java.util.Map;

// Input: nums = [3,1,4,1,5], k = 2
// Output: 2
// Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
// Although we have two 1s in the input, we should only return the number of unique pairs.

// Input: nums = [1,2,3,4,5], k = 1
// Output: 4
// Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

// Input: nums = [1,3,1,5,4], k = 0
// Output: 1
// Explanation: There is one 0-diff pair in the array, (1, 1).

class K_diff_Pairs_in_an_Array {

    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int curr : nums) {
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        int res = 0;

        for (int x : map.keySet()) {
            if (k > 0 && map.containsKey(x + k) || k == 0 && map.get(x) > 1) {
                res++;
            }
        }

        return res;
    }

    // public static int findPairs(int[] nums, int k) {
    // Set<Integer> uniquePair = new HashSet();
    // Arrays.sort(nums);
    // int n = nums.length;

    // for (int i = 0; i < n - 1; i++)
    // if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
    // uniquePair.add(nums[i]);

    // return uniquePair.size();
    // }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 1, 5 };
        int k = 2;
        int res = findPairs(arr, k);
        System.out.println(res);
    }
}
