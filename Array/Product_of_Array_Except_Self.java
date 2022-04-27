class Product_of_Array_Except_Self {

    // using division Operator
    // public static int[] productExceptSelf(int[] nums) {

    // int prod = 1;
    // int ans[] = new int[nums.length];

    // for (int i = 0; i < nums.length; i++) {
    // prod = prod * nums[i];
    // }

    // for (int i = 0; i < nums.length; i++) {

    // try {

    // if (prod / nums[i] > 0) {
    // ans[i] = prod / nums[i];
    // } else {
    // ans[i] = 0;
    // }

    // } catch (ArithmeticException e) {
    // System.out.println("Error");
    // }

    // }

    // return ans;
    // }

    // without using diviusion
    // public static int[] productExceptSelf(int[] nums) {
    // int n = nums.length;
    // int res[] = new int[n];
    // int left[] = new int[n];
    // int right[] = new int[n];

    // left[0] = 1;
    // for (int i = 1; i < n; i++) {
    // left[i] = left[i - 1] * nums[i - 1];
    // }

    // right[n - 1] = 1;
    // for (int i = n - 2; i >= 0; i--) {
    // right[i] = right[i + 1] * nums[i + 1];
    // }

    // for (int i = 0; i < n; i++) {
    // res[i] = left[i] * right[i];
    // }
    // return res;

    // }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 7 };
        int res[] = productExceptSelf(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}