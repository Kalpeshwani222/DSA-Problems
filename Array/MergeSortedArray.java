import java.util.Arrays;

class MergeSortedArray {

    // Solution -1
    // with using 3rd array

    // static void merge(int[] arr1, int m, int[] arr2, int n) {
    // int len1 = arr1.length;
    // int len2 = arr2.length;

    // int result[] = new int[len1 + len2];

    // int i = 0; // array 1
    // int j = 0; // array 2
    // int k = 0; // array result

    // // for copying the elements until the length of the array
    // while (i < len1 && j < len2) {
    // if (arr1[i] < arr2[j]) {
    // result[k++] = arr1[i++];
    // } else {
    // result[k++] = arr2[j++];
    // }
    // }

    // while (i < len1) {
    // result[k++] = arr1[i++];
    // }

    // while (j < len2) {
    // result[k++] = arr2[j++];
    // }

    // for (int l = 0; l < result.length; l++) {
    // System.out.println(result[l]);
    // }

    // }

    // solution -2
    // with using third array
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = (m + n - 1);

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) { // checking the greatest value
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (i >= 0) { // check if the array nums1 values is copy or not
            nums1[k--] = nums1[i--];
        }

        while (j >= 0) { // check if the array nums2 values is copy or not
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }

    public static void main(String args[]) {
        int m = 3, n = 3;
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };

        int res[] = merge(arr1, m, arr2, n);

        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
}
