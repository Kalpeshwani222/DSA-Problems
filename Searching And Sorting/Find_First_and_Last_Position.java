// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Input: nums = [], target = 0
// Output: [-1,-1]

class Find_First_and_Last_Position {
    // public static int[] searchRange(int[] arr, int target) {

    // int left = -1;
    // int right = -1;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // if (left == -1) {
    // left = i;
    // }
    // right = i;
    // }
    // }

    // return new int[] { left, right };
    // }

    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;
    }

    public static int findFirst(int arr[], int target) {
        int idx = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target)
                idx = mid;
        }
        return idx;

    }

    public static int findLast(int arr[], int target) {

        int idx = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (arr[mid] == target)
                idx = mid;
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int t = 8;
        int res[] = searchRange(arr, t);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
