class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    // public static boolean isPowerOfTwo(int n) {
    // return (n > 0 && (n & (n - 1)) == 0);
    // }

    public static void main(String[] args) {
        int n = 8;
        boolean res = isPowerOfTwo(n);
        System.out.println(res);

    }
}