class RotateKTimes {

    public static void reverse(int nums[], int k) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
            // temp[(0+3)%7] = nums[i];
        }

        // copying the temp[] to the nums[]

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        // printing
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 3;
        reverse(arr, k);
    }
}