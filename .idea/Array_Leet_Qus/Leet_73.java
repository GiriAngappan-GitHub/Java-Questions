package Array_Leet_Qus;

import java.util.ArrayList;
import java.util.Arrays;

public class Leet_73 {
    public static void main(String[] args) {
        int[][] matrix =
        {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j] == 0)
                {
                    r[i]=1;
                    c[j]=1;
                }

            }

        }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(r[i] ==1 || c[j]==1 )
                {

                    matrix[i][j] = 0;
                }

            }

        }
        System.out.println(Arrays.toString(r) + "c"+Arrays.toString(c));
        System.out.println(Arrays.deepToString(matrix));


//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        boolean firstRowZero = false;
//        boolean firstColZero = false;
//
//        // Step 1: Determine if the first row or first column should be zeroed
//        for (int i = 0; i < m; i++) {
//            if (matrix[i][0] == 0) {
//                firstColZero = true;
//                break;
//            }
//        }
//
//        for (int j = 0; j < n; j++) {
//            if (matrix[0][j] == 0) {
//                firstRowZero = true;
//                break;
//            }
//        }
//
//        // Step 2: Use first row and column to mark zero rows and columns
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    matrix[i][0] = 0;
//                    matrix[0][j] = 0;
//                }
//            }
//        }
//
//        // Step 3: Zero out marked rows and columns
//        for (int i = 1; i < m; i++) {
//            if (matrix[i][0] == 0) {
//                for (int j = 1; j < n; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        for (int j = 1; j < n; j++) {
//            if (matrix[0][j] == 0) {
//                for (int i = 1; i < m; i++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        // Step 4: Handle the first row and column
//        if (firstRowZero) {
//            for (int j = 0; j < n; j++) {
//                matrix[0][j] = 0;
//            }
//        }
//
//        if (firstColZero) {
//            for (int i = 0; i < m; i++) {
//                matrix[i][0] = 0;
//            }
//        }
//
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }
    }



    }

