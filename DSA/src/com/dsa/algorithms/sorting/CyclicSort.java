package com.dsa.algorithms.sorting;

import java.util.Arrays;

/*
TC -> O(n)
SC -> O(1)
 */

public class CyclicSort {

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

}