import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//169
// Input: nums = [3,2,3]
// Output: 3
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Majority_Element {

    // solution -1

    // public static int majorityElement(int[] nums) {
    // boolean visited[] = new boolean[nums.length];

    // Arrays.fill(visited, false);

    // for (int i = 0; i < nums.length; i++) {
    // // skipped the elem is already processed
    // if (visited[i] == true) {
    // continue;
    // }

    // // count freq
    // int count = 1;
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // visited[j] = true;
    // count++;
    // }
    // }

    // // System.out.println(nums[i] + " " + " =" + count);
    // if (count > nums.length / 2) {
    // System.out.println(nums[i]);
    // }

    // }
    // return 0;
    // }

    // solution -2

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) + 1;

                if (count > nums.length / 2) {
                    // System.outd.println(nums[i]);
                    return nums[i];
                } else {
                    map.put(nums[i], count);
                }
            } else {
                map.put(nums[i], 1);
            }

        }

        System.out.println("No elem");
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        majorityElement(arr);
    }
}
