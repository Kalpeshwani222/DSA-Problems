import java.util.HashMap;
import java.util.Map;

class RemoveDuplicatesFromSortedArray {

    // public static void RemoveDuplicates(int arr[]) {
    // Map<Integer, Integer> map = new HashMap<>();
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (map.containsKey(arr[i])) {
    // map.put(arr[i], map.get(arr[i]) + 1);
    // } else {
    // map.put(arr[i], 1);
    // }
    // }

    // for (Map.Entry mapElem : map.entrySet()) {
    // // int key = (int) mapElem.getKey();
    // // int value = (int) mapElem.getValue();
    // // System.out.println(key + " " + value);
    // count++;

    // }
    // System.out.println(count);

    // }

    public static int RemoveDuplicates(int arr[]) {
        int j = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i + 1];
            }
        }

        return j;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };

        int res = RemoveDuplicates(arr);
        System.out.println(res);
    }
}
