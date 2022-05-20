import java.util.Scanner;

public class Search_given_no {

    public static boolean search(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Element to search");
        int x = sc.nextInt();

        boolean res = search(numbers, x);
        System.out.println(res);
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (numbers[i][j] == x) {
        // System.out.print("row" + "=" + i + " " + "col" + "=" + j);
        // }
        // }
        // }

    }
}
