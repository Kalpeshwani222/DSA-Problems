//  Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//1480

class Running_sum {
    public static int[] runningSum(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            nums[i] += nums[i - 1];
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int res[] = runningSum(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
