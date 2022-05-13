class Minimum_Moves_to_Equal_Array_Elements {
    public static int minMoves(int arr[]) {

        int min = arr[0];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i] - min;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(minMoves(arr));
    }
}