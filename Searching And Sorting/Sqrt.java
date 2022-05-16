public class Sqrt {
    public static int mysqrt(int no) {
        if (no == 0) {
            return 0;
        }
        int start = 0;
        int end = no;
        int ans = 0;
        long mid = start + (end - start) / 2;

        while (start <= end) {
            long square = mid * mid;
            if (square == no) {
                return (int) mid;
            }
            if (square < no) {
                ans = (int) mid;
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }
            mid = start + (end - start) / 2;

        }

        return ans;
    }

    public static void main(String[] args) {
        int no = 36;
        int res = mysqrt(no);
        System.out.println(res);
    }
}

// public int mySqrt(int x) {
// if (x == 0) return 0;
// int start = 1, end = x;
// while (start < end) {
// int mid = start + (end - start) / 2;
// if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
// return mid;
// else if (mid > x / mid)// Keep checking the left part
// end = mid;
// else
// start = mid + 1;// Keep checking the right part
// }
// return start;
// }