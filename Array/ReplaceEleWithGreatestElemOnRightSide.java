public class ReplaceEleWithGreatestElemOnRightSide {
    public static void main(String[] args) {
        int arr[] = { 17, 18, 5, 4, 6, 1 };

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];

            arr[i] = max; // put the max in array

            if (temp > max) {
                max = temp; // update the max
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
