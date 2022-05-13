import java.util.HashSet;
import java.util.Set;

class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String str) {
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int len = str.length();

        Set<Character> set = new HashSet<>();

        while (i < len && j < len) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                maxCount = Math.max(maxCount, j - i);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return maxCount;
    }

    // public int lengthOfLongestSubstring(String s) {
    // if (s.length() == 0)
    // return 0;
    // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    // int max = 0;
    // for (int i = 0, j = 0; i < s.length(); ++i) {
    // if (map.containsKey(s.charAt(i))) {
    // j = Math.max(j, map.get(s.charAt(i)) + 1);
    // }
    // map.put(s.charAt(i), i);
    // max = Math.max(max, i - j + 1);
    // }
    // return max;
    // }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}
