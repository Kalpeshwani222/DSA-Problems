import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {

    // Brute Force Approach

    // public static int[] twoSum(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }

    // return null;
    // }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];

            if (map.containsKey(numToFind) && map.get(numToFind) != i) {
                return new int[] { i, map.get(numToFind) };
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 13, 15 };
        int target = 9;
        int[] res = twoSum(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}