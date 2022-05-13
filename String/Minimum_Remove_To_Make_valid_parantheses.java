import java.util.Stack;

class Minimum_Remove_To_Make_valid_parantheses {

    // public static String minRemove(String str) {
    // int open = 0;
    // StringBuilder sb = new StringBuilder();

    // for (char c : str.toCharArray()) {
    // if (c == '(') {
    // open++;
    // } else if (c == ')') {
    // if (open == 0)
    // continue;
    // open--;
    // }
    // sb.append(c);
    // }

    // StringBuilder res = new StringBuilder();
    // for (int i = sb.length() - 1; i >= 0; i--) {
    // char c = sb.charAt(i);
    // if (c == '(' && open > 0) {
    // open--;
    // continue;
    // }
    // res.append(c);
    // }
    // return res.reverse().toString();
    // }

    public static String minRemove(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if ("(".equals(arr[i])) {
                stack.push(i);
            } else if (")".equals(arr[i])) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    arr[i] = "";
                }
            }
        }
        while (!stack.isEmpty()) {
            arr[stack.pop()] = "";
        }
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        String res = minRemove(str);
        System.out.println(res);
    }
}