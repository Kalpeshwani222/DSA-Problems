class Maximum_Subarray {

    // public static int maxSubArray(int[] nums) {
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;

    // for (int j = i; j < nums.length; j++) {
    // sum += nums[j];
    // max = Math.max(sum, max);
    // }
    // }
    // return max;
    // }

    // using kaden's algo
    public static int maxSubArray(int[] nums) {
        int bestsum = Integer.MIN_VALUE;
        int currentsum = 0;

        for (int i = 0; i < nums.length; i++) {
            // check if the current no and currentsum which is greater peek the greatest
            // value
            currentsum = Math.max(nums[i], currentsum + nums[i]);

            // if the current sum values is greater than the bestsum then update it
            // otherwise not update it
            bestsum = Math.max(bestsum, currentsum);

        }
        return bestsum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int res = maxSubArray(arr);

        System.out.println(res);
    }
}