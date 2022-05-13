import java.util.Arrays;

class Shortest_unsorted_Continueous_subarray {
    public static int findUnsortedArray(int nums[]) {
        int arr[] = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        Arrays.sort(arr);

        int start = 0, end = nums.length - 1;

        for (start = 0; start < nums.length; start++) {
            if (nums[start] != arr[start]) {
                break;
            }
        }

        if (start >= nums.length - 1)
            return 0;

        for (end = nums.length - 1; end >= 0; end--) {
            if (nums[end] != arr[end]) {
                break;
            }
        }

        return end - start + 1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, 8, 10, 9, 15 };
        int res = findUnsortedArray(arr);
        System.out.println(res);
    }
}