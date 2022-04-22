import java.util.Arrays;

class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 4 };

        int n = arr.length;
        int expectedTotal = (n * (n + 1)) / 2;
        System.out.println(expectedTotal);

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        System.out.println(expectedTotal - total);

    }
}