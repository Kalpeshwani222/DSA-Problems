import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.

// Input: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.

class Sort_Characters_By_Frequency {

    // public static String frequencySort(String str) {
    // Map<Character, Integer> map = new HashMap<>();
    // int len = str.length();
    // StringBuilder sb = new StringBuilder();

    // // traverse a string and store each Character and it's count in map
    // for (int i = 0; i < len; i++) {
    // char ch = str.charAt(i);
    // map.put(ch, map.getOrDefault(ch, 0) + 1);
    // }

    // // sort this map by frequency
    // map.entrySet().stream()
    // .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
    // .forEach(record -> {
    // Character key = record.getKey();
    // int value = record.getValue();

    // // append the character by the no of times occurs
    // for (int i = 0; i < value; i++) {
    // sb.append(key);
    // }
    // });

    // return sb.toString();

    // }
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character>[] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < pos; i++)
                        sb.append(c);

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "tree";
        String res = frequencySort(str);
        System.out.println(res);

    }
}