package com.dsa.arrays.easy;

import java.util.Arrays;

/*
TC -> O(N log N)
SC -> O(1)
 */
public class KthSmallestNumber {

    public static int getKthSmallest(int[] array, int k) {
        Arrays.sort(array);
        return array[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 3;

        int result = getKthSmallest(arr, k);

        System.out.println(result);
    }
}
