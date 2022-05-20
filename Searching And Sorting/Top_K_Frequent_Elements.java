import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Top_K_Frequent_Elements {

    // public static int[] topKFrequent(int[] arr, int k) {
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int curr : arr) {
    // map.put(curr, map.getOrDefault(curr, 0) + 1);
    // }

    // List<Integer> res = map.entrySet().stream()
    // .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
    // .limit(k)
    // .map(i -> i.getKey())
    // .collect(Collectors.toList());

    // int[] resultArr = new int[res.size()];

    // for (int i = 0; i < res.size(); i++) {
    // resultArr[i] = res.get(i);
    // }
    // return resultArr;
    // }
    public static int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int curr : arr) {
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((num1, num2) -> map.get(num1) - map.get(num2));

        for (int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int res[] = topKFrequent(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
