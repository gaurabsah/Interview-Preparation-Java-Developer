package com.dsa.arrays.easy;

import java.util.Arrays;

/*
TC -> O(N)
SC -> O(1)
 */
public class MoveAllNegativeToBeginning {

    static void moveAllNegativeToBeginning(int[] array, int n) {
        int j = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }

//    using two pointers
    static void moveAllNegativeToBeginningPointers(int[] array, int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (array[start] < 0 && array[end] < 0) {
                start++;
            } else if (array[start] > 0 && array[end] < 0) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            } else if (array[start] > 0 && array[end] > 0) {
                end--;
            } else {
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = numbers.length;

        moveAllNegativeToBeginningPointers(numbers, n);

        System.out.println(Arrays.toString(numbers));

    }
}
