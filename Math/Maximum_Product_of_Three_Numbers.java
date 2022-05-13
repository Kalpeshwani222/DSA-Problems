// Input: nums = [1,2,3]
// Output: 6

// Input: nums = [1,2,3,4]
// Output: 24

import java.util.Arrays;

class Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length - 1;

        int max1 = arr[0] * arr[1] * arr[n];
        int max2 = arr[n] * arr[n - 1] * arr[n - 2];

        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int res = maximumProduct(arr);
        System.out.println(res);

    }
}
