package com.dsa.algorithms.sorting;

import java.util.Arrays;

/*
TC -> O(n^2)
SC -> O(1)
 */

public class InsertionSort {

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {12, -1, 0, -32, 89};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

}
