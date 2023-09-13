package com.array1;

import java.util.Arrays;

public class SetMatrixZeros {

    //    Brute force
    /*
    TC -> O((n*m)+(n+m))
    SC -> O(1)
     */
    public static void setMatrixZero(int[][] matrix, int nRow, int nCol) {
        for (int row = 0; row < nRow; row++) {
            for (int col = 0; col < nCol; col++) {
                if (matrix[row][col] == 0) {
                    markRow(matrix, nRow, nCol, row);
                    markCol(matrix, nRow, nCol, col);
                }
            }
        }

        // Finally, mark all -1 as 0:
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markRow(int[][] matrix, int n, int m, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    static void markCol(int[][] matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    //    Better approach
     /*
    TC -> O((n*m))
    SC -> O(n)
     */

    public static void setMatrixZero2(int[][] matrix, int nRow, int nCol) {
        int[] row1 = new int[nRow]; // row array
        int[] col1 = new int[nCol]; // col array

        for (int row = 0; row < nRow; row++) {
            for (int col = 0; col < nCol; col++) {
                if (matrix[row][col] == 0) {
                    // mark ith index of row wih 1:
                    row1[row] = 1;
                    // mark ith index of col wih 1:
                    col1[col] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                if (row1[i] == 1 || col1[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //    Optimal approach
     /*
    TC -> O((n*m))
    SC -> O(1)
     */
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // int row[n] = {0}; --> matrix[..][0]
        // int col[m] = {0}; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark i-th row:
                    matrix[i][0] = 0;

                    // mark j-th column:
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    // check for col & row:
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        /*
        row ->
        column (|)
        int[][] arr = new int[4][4];
        new int[row][column]

        1 1 1 1
        1 0 0 1
        1 1 0 1
        1 1 1 1

        arr[0]= {1, 1, 1, 1}
        arr[1]= {1, 0, 0, 1}
        arr[2]= {1, 1, 0, 1}
        arr[3]= {1, 1, 1, 1}

        arr[0][0]=1
        arr[0][1]=1
        arr[0][2]=1 and so on...
         */

        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        int nRows = arr.length;
        int nCols = arr[0].length;

        System.out.println(nRows + " " + nCols);


//        setMatrixZero(arr, nRows, nCols);

//        setMatrixZero2(arr, nRows, nCols);

        setZeroes(arr);

//        printing using deepToString()
//        System.out.println(Arrays.deepToString(arr));

//        printing using toString()
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

//        printing using nested for loop
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }

//        System.out.println("--------------------------------");

//        printing using Stream API Java 8
//        Arrays.stream(arr).forEach(i -> {
//            Arrays.stream(i).forEach(j -> System.out.print(j + " "));
//            System.out.println();
//        });

//        printing using for each loop
//        for (int[] i : arr) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
    }
}
