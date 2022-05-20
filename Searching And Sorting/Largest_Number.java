import java.util.Arrays;

class Largest_Number {
    public static String largestNumber(int[] arr) {
        if (arr.length == 0) {
            return "";
        }
       
        String[] s = new String[arr.length];

        // convering int to str arr
        for (int i = 0; i < arr.length; i++) {
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        String res = sb.toString();
        return res.startsWith("0") ? "0" : res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 30, 34, 5, 9 };
        String res = largestNumber(arr);
        System.out.println(res);
    }
}