import java.util.Arrays;

class ThreeSumClosest {

    // Brute Force Approach
    public static void ThreeSumClosest(int arr[], int target) {

        int result = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (Math.abs(diff) > Math.abs(sum - target)) {
                        diff = sum - target;
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }

    // public static void ThreeSumClosest(int arr[], int target) {
    // Arrays.sort(arr);

    // int diff = Integer.MAX_VALUE;
    // int result = 0;

    // for (int i = 0; i < arr.length; i++) {
    // int low = i + 1;
    // int high = arr.length - 1;

    // while (low < high) {
    // int sum = arr[i] + arr[low] + arr[high];

    // if (Math.abs(diff) > Math.abs(sum - target)) {
    // diff = sum - target;
    // result = sum;
    // }

    // if (sum > target) {
    // low++;
    // } else {
    // high--;
    // }
    // }
    // }
    // System.out.println(result);
    // }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, -3 };
        int target = 1;

        ThreeSumClosest(arr, target);
    }
}
