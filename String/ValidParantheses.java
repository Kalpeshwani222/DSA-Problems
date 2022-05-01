import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else if (!stack.empty() && ((str.charAt(i) == ']' && stack.peek() == '[') ||
                    (str.charAt(i) == ')' && stack.peek() == '(') ||
                    (str.charAt(i) == '}' && stack.peek() == '{')

            )) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}(";
        boolean res = isValid(str);
        System.out.println(res);
    }
}
