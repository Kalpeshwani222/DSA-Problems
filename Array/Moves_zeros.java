class Moves_zeros {

    // with making the copy of the array

    // public static void moveZeroes(int[] nums) {
    // int arr[] = new int[nums.length];
    // int j = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] != 0) {
    // arr[j++] = nums[i];
    // }
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }

    // solution -1

    // public static void moveZeroes(int[] nums) {
    // int j = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] != 0) {
    // nums[j++] = nums[i];
    // }
    // }

    // while (j < nums.length) {
    // nums[j++] = 0;
    // }

    // for (int i = 0; i < nums.length; i++) {
    // System.out.println(nums[i]);
    // }
    // }

    // solution -2
    // using 2-pointer

    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        if (n == 0 || n == 1) {
            return;
        }

        int left = 0, right = 0;
        int temp;

        while (right < n) {
            if (nums[right] == 0) {
                ++right;
            } else {
                // swaping
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                ++left;
                ++right;

            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
    }
}
