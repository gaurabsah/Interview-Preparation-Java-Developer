package com.dsa.arrays.easy;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] reverse(int[] array, int n) {
        int start = 0;
        int end = n - 1;
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;

        reverse(array, n);
        System.out.println(Arrays.toString(array));
    }
}
