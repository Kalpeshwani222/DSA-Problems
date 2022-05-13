class Reverse_Words_III {
    // public static void reverseWords(String str) {
    // String words[] = str.split(" ");
    // String res = "";

    // for (int i = 0; i < words.length; i++) {
    // String word = words[i];
    // String revword = "";

    // for (int j = word.length() - 1; j >= 0; j--) {
    // revword = revword + word.charAt(j);
    // }
    // res += revword + " ";
    // }
    // System.out.println(res);
    // }


    
    // public static String reverseWords(String s) {
    // String words[] = s.split(" ");
    // StringBuilder res = new StringBuilder();
    // for (String word : words)
    // res.append(new StringBuffer(word).reverse().toString() + " ");

    // return res.toString().trim();
    // }

    public static String reverseWords(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder(); // let's

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest ";
        String res = reverseWords(str);
        System.out.println(res);
    }

}
