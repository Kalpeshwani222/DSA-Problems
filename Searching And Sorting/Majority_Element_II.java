import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Majority_Element_II {

    // public static List<Integer> majorityElement(int[] arr) {
    // Set<Integer> res = new HashSet<>();
    // int majorityElement = arr.length / 3;

    // for (int i = 0; i < arr.length; i++) {
    // int count = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // }

    // if (count > majorityElement) {
    // res.add(arr[i]);
    // }
    // }
    // return new ArrayList<>(res);
    // }

    public static List<Integer> majorityElement(int[] arr) {
        int majorityElement = arr.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> record : map.entrySet()) {
            if (record.getValue() > majorityElement) {
                list.add(record.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        ArrayList<Integer> res = (ArrayList<Integer>) majorityElement(arr);

        res.forEach(v -> {
            System.out.println(v);
        });
    }
}