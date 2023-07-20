package com.dsa.arrays.easy;

/*
TC -> O(N)
SC -> O(1)
 */
public class MinMaxElement {

    public static int min(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int max(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 2, 45, 21, 66, 77, 11, 2, 1};
        int n = arr.length;

        System.out.println("Minimum value: " + min(arr, n));

        System.out.println("Maximum value: " + max(arr, n));
    }
}
