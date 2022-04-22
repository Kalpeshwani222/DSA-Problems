import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class IntersectionOfTwoArrays {

    // public static int[] intersection(int[] arr1, int[] arr2) {
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // List<Integer> list = new ArrayList<>();
    // int i = 0;
    // int j = 0;

    // while (i < arr1.length && j < arr2.length) {

    // while ((i < arr1.length - 1) && (arr1[i] == arr1[i + 1])) {
    // i++;
    // }

    // while ((j < arr2.length - 1) && (arr2[j] == arr1[j + 1])) {
    // j++;
    // }

    // if (arr1[i] < arr2[j]) {
    // i++;
    // } else if (arr1[i] > arr2[j]) {
    // j++;
    // } else {
    // list.add(arr1[i]);
    // i++;
    // j++;
    // }

    // }

    // System.out.println(list);
    // return null;
    // }
    public static int[] intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        Set<Integer> tempset = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        while (i < arr1.length) {
            tempset.add(arr1[i++]);
        }

        while (j < arr2.length) {
            if (tempset.contains(arr2[j])) {
                res.add(arr2[j]);
            }
            // value not present n tempset just increment the j
            j++;
        }

        int arr[] = new int[res.size()];
        int res1 = 0;
        for (Integer s : res) {
            arr[res1++] = s;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
        int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };

        intersection(arr1, arr2);

    }
}
