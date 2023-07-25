package com.dsa.algorithms.sorting;

import java.util.Arrays;

/*
TC -> O(n^2)
SC -> O(1)
 */

public class SelectionSort {

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            find the max element
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i < arr.length; i++) {
            if (arr[max] < arr[last]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3, 9, 7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
