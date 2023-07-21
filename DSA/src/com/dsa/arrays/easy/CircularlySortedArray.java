package com.dsa.arrays.easy;

/*
TC -> O(N)
SC -> O(1)
 */
public class CircularlySortedArray {

    //    check if array is circular and sorted
    public static boolean isCircularSorted(int[] array, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i - 1] > array[i]) {
                count++;
            }
        }

        if (count == 1) {
            // check first and last element.
            return array[0] > array[n - 1];
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {23, 34, 45, 12, 17, 19};
        int n = arr.length;

        boolean result = isCircularSorted(arr, n);

        if (result) {
            System.out.println("Array is circular and sorted");
        } else {
            System.out.println("Array is not circular and sorted");
        }

    }
}
