import java.util.Stack;

// Input: s = "abcd", k = 2
// Output: "abcd"
// Explanation: There's nothing to delete.

// Input: s = "deeedbbcccbdaa", k = 3
// Output: "aa"
// Explanation: 
// First delete "eee" and "ccc", get "ddbbbdaa"
// Then delete "bbb", get "dddaa"
// Finally delete "ddd", get "aa"

// Input: s = "pbbcggttciiippooaais", k = 2
// Output: "ps"

class Remove_All_Adjacent_DuplicatesII {

    class Node {
        char data;
        int freq;

        Node(char d, int f) {
            data = d;
            freq = f;
        }
    }

    public String removeDuplicates(String str, int k) {
        Stack<Node> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().data == c) {
                Node curr = stack.pop();
                curr.freq = +1;
                stack.push(curr);
            } else {
                stack.push(new Node(c, 1));
            }

            if (!stack.isEmpty() && stack.peek().freq == k) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            int freq = cur.freq;
            while (freq-- > 0) {
                sb.append(cur.data);
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
        int k = 3;
        Remove_All_Adjacent_DuplicatesII rd = new Remove_All_Adjacent_DuplicatesII();

        String res = rd.removeDuplicates(str, k);
        System.out.println(res);
    }
}