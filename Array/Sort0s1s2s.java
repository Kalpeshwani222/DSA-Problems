class Sort0s1s2s {
    // solutio -1

    // public static void sort(int arr[]) {
    // int zeros = 0, ones = 0, twos = 0;

    // int res[] = new int[arr. length];

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // zeros++;
    // }

    // if (arr[i] == 1) {
    // ones++;
    // }

    // if (arr[i] == 2) {
    // twos++;
    // }
    // }

    // for (int i = 0; i < zeros; i++) {
    // res[i] = 0;
    // }

    // for (int i = zeros; i < (zeros + ones); i++) {
    // res[i] = 1;
    // }

    // for (int i = (zeros + ones); i < res.length; i++) {
    // res[i] = 2;
    // }

    // for (int i = 0; i < res.length; i++) {
    // System.out.println(res[i]);
    // }
    // }

    public static void sort(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low++;
                    mid++;
                    break;
                }

                case 1:
                    mid++;
                    break;

                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;

                    high--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 0, 2, 1, 1, 0 };

        sort(arr);
    }
}
