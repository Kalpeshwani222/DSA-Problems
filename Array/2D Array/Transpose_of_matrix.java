import java.util.Scanner;

class Transpose_of_matrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res[][] = new int[col][row]; // col*row

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
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
        transpose(numbers);

    }
}