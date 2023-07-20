package com.dsa.arrays.easy;

import java.util.Arrays;

/*
TC -> O(N logN)
SC -> O(1)
 */
public class SortAnElement {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 2, 45, 21, 66, 77, 11, 2, 1};
        int n = arr.length;

        Arrays.sort(arr); // uses QuickSort

        System.out.println(Arrays.toString(arr));
    }
}
