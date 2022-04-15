class Fibonacci_Number {

    // public static int fibonacci(int N) {
    // if (N <= 1)
    // return N;

    // int a = 0, b = 1;

    // for (int i = 2; i <= N; i++) {
    // int sum = a + b;
    // a = b;
    // b = sum;
    // }
    // return b;
    // }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + (n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        int res = fibonacci(n);
        System.out.println(res);
    }
}
