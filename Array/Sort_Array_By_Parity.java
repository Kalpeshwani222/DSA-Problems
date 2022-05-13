class Sort_Array_By_Parity {
    // public static int[] sortArrayByParity(int[] arr) {
    // int l = 0;
    // int r = arr.length - 1;
    // while (l < r) {
    // if (arr[l] % 2 == 0) {
    // int temp = arr[l];
    // arr[l] = arr[r];
    // arr[r] = temp;
    // l++;
    // r--;
    // } else {
    // int temp = arr[r];
    // arr[r] = arr[l];
    // arr[l] = temp;
    // l++;
    // r--;
    // }
    // }

    // return arr;
    // }

    public static int[] sortArrayByParity(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            while (l < r && arr[l] % 2 == 0)
                l++;
            while (l < r && arr[r] % 2 == 1)
                r--;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        int res[] = sortArrayByParity(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}