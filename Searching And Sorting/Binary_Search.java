class Binary_Search {
    public static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int mid = (s + e) / 2;

        while (s <= e) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = (s + e) / 2;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int t = 9;
        search(arr, t);

    }
}