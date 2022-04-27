import java.util.HashMap;

public class Subarray_Sum_Equals_K {

    // brute force solution

    // public static int subarraySum(int[] arr, int k) {
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // for (int j = i; j < arr.length; j++) {
    // sum = sum + arr[j];
    // if (sum == k) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // public static int subarraySum(int[] nums, int k) {
    // if (nums.length == 0)
    // return 0;

    // int count = 0; //1
    // HashMap<Integer, Integer> map = new HashMap<>(); // 1

    // int curr_sum = 0; // 2

    // for (int n : nums) { // 1, 1, 1
    // curr_sum = curr_sum + n;

    // if (curr_sum == k) {
    // count += 1;
    // }

    // if (map.containsKey(curr_sum - k)) {
    // count = count + map.get(curr_sum - k);
    // }

    // if (map.containsKey(curr_sum)) {
    // int val = map.get(curr_sum) + 1;
    // map.replace(curr_sum, val);
    // } else {
    // map.put(curr_sum, 1);
    // }
    // }

    // return count;

    // }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        int k = 2;
        int res = subarraySum(arr, k);

        System.out.println(res);
    }
}
