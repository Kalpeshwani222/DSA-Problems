import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class ThreeSumProblem {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();

        if (nums.length < 3)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;

            if (i == 0 || (i > 0) && (nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1])
                            lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1])
                            hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }
        return res;
    }

    // using set
    // public static List<List<Integer>> threeSum(int nums[]) {

    // Set<List<Integer>> result = new HashSet<>();

    // if (nums.length == 0) {
    // return new ArrayList<>(result);
    // }

    // Arrays.sort(nums);

    // for (int i = 0; i < nums.length - 2; i++) {
    // int low = i + 1;
    // int high = nums.length - 1;

    // while (low < high) {
    // int sum = nums[i] + nums[low] + nums[high];

    // if (sum == 0) {
    // result.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
    // } else if (sum > 0) {
    // high--;
    // } else {
    // low++;
    // }
    // }
    // }
    // return new ArrayList<>(result);

    // }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> list = new ArrayList<>();

        list = threeSum(arr);
        list.forEach(values -> {
            System.out.println(values);
        });

    }

}
