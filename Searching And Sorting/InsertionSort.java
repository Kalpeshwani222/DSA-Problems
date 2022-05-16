public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 38, 52, 9, 18, 6, 62, 13 };
        int n = arr.length;
        int temp, j;

        for (int i = 1; i < n; i++) {
            temp = arr[i];
            j = i;

            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
