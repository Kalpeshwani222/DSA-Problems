import java.util.Arrays;

class SquaresOfSortedArray {
    // sol -1
    // public static int[] sort(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = arr[i] * arr[i];
    // }

    // Arrays.sort(arr);

    // return arr;
    // }

    // sol -2
    public static int[] sort(int arr[]) {

        int l = 0;
        int r = arr.length - 1;
        int[] res = new int[arr.length];

        for (int k = arr.length - 1; k >= 0; k--) {
            if (Math.abs(arr[r]) > Math.abs(arr[l])) {
                res[k] = arr[r] * arr[r--];
            } else {
                res[k] = arr[l] * arr[l++];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -7, -3, 2, 3, 11 };

        int res[] = sort(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}