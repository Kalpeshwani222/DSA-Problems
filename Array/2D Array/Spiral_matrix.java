import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Spiral_matrix {
    public static void Spiral_matrix(int matrix[][]) {
        List<Integer> list = new ArrayList<>();

        int row = matrix.length;
        // if (row == 0)
        // return list;
        int col = matrix[0].length;

        int l = 0;
        int r = col - 1;
        int t = 0;
        int b = row - 1;
        int d = 0;

        while (l <= r && t <= b) {

            if (d == 0) {
                for (int i = l; i <= r; i++) { // process left to right
                    list.add(matrix[t][i]); // add the top
                }

                d = 1; // direction 0 process then set to the d=1;
                t++; // then increment the top by 1;
            } else if (d == 1) {
                for (int i = t; i <= b; i++) { // process top to bottom
                    list.add(matrix[i][r]); // add the right
                }

                d = 2; // direction 1 process then set to the d=2;
                r--; // then decrement by 1.
            } else if (d == 2) {
                for (int i = r; i >= l; i--) { // process the right to the left
                    list.add(matrix[b][i]); // add the bottom
                }

                d = 3;// direction 2 process then set to the d=3;
                b--; // decrement the bottom by 1.

            } else if (d == 3) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                d = 0;//// direction 3 process then again set the direction to the d=0;
                l++; // incremtnt the left by 1.

            }
        }

        for (int curr : list) {
            System.out.println(curr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        Spiral_matrix(matrix);

    }
}