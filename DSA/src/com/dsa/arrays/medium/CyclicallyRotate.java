package com.dsa.arrays.medium;

import java.util.Arrays;

/*
Left/Right rotation
TC -> O(N)
SC -> O(1)
 */
public class CyclicallyRotate {

    static void rotate(int[] arr, int n) {
        int last_el = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last_el;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        rotate(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}
