// 852
// Input: arr = [0,1,0]
// Output: 1

class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }

            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0 };
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);

    }
}