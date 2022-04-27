//35
class SearchInsertPosition {
    public static int SearchInsertPosition(int nums[], int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 7;
        int res = SearchInsertPosition(arr, target);
        System.out.println(res);
    }
}
