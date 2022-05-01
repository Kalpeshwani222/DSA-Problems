import java.util.Stack;

// Input: s = "abbaca"
// Output: "ca"
// Explanation: 
// For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

class Remove_All_Adjacent_Duplicates {

    public static String removeDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty() && str.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        for (char s : stack) {
            sb.append(s);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        String res = removeDuplicates(str);
        System.out.println(res);

    }
}
