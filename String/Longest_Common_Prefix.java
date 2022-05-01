class Longest_Common_Prefix {

    // public static String longestCommonPrefix(String[] strs) {

    // if (strs == null || strs.length == 0) {
    // return "";
    // }

    // String res = strs[0];

    // for (int i = 1; i < strs.length; i++) {
    // String currentWord = strs[i];
    // int j = 0;

    // while (j < currentWord.length() && j < res.length() && currentWord.charAt(j)
    // == res.charAt(j)) {
    // j++;

    // }
    // if (j == 0) {
    // return "";
    // }

    // res = currentWord.substring(0, j);

    // }
    // return res;
    // }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        String res = longestCommonPrefix(str);
        System.out.println(res);
    }
}
