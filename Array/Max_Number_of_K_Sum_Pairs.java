import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Max_Number_of_K_Sum_Pairs {

    // public static int maxOperations(int[] nums, int k) {
    // Map<Integer, Integer> map = new HashMap<>();
    // int count = 0;

    // for (int curr : nums) {
    // int res = k - curr;
    // if (map.containsKey(res)) {
    // count++;
    // if (map.get(res) == 1) {
    // map.remove(res);
    // } else {
    // map.put(res, map.get(res) - 1);
    // }
    // } else {
    // map.put(curr, map.getOrDefault(curr, 0) + 1);
    // }
    // }

    // return count;
    // }

    public static int maxOperations(int[] nums, int k) {
        int fp = 0, bp = nums.length - 1, count = 0;
        Arrays.sort(nums);

        while (fp < bp) {
            if (nums[fp] + nums[bp] == k) {
                count++;
                fp++;
                bp--;
            } else if (nums[fp] + nums[bp] > k)
                bp--;
            else
                fp++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 5;
        int res = maxOperations(arr, k);
        System.out.println(res);
    }
}