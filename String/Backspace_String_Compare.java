import java.util.Stack;

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".

class Backspace_String_Compare {

    public static boolean backspaceCompare(String str1, String str2) {
        Stack<Character> stack1 = backspaceOperation(str1);
        Stack<Character> stack2 = backspaceOperation(str2);

        return stack1.equals(stack2);
    }

    public static Stack<Character> backspaceOperation(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr != '#') {
                stack.push(curr);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        String str1 = "ab#c";
        String str2 = "ad#c";
        boolean res = backspaceCompare(str1, str2);
        System.out.println(res);

    }
}
