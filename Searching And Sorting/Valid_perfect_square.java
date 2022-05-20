class Valid_perfect_square {

    // public static boolean isPerfectSquare(int n) {
    // if (n < 2) {
    // return true;
    // }

    // for (int i = 2; i <= n / 2; i++) {
    // if (i * i == n) {
    // return true;
    // } else if (i * i > n) {
    // return false;
    // }
    // }
    // return false;

    // }

    public static boolean isPerfectSquare(int n) {
        if (n < 2) {
            return true;
        }
        long s = 2;
        long e = n / 2;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return true;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }
}