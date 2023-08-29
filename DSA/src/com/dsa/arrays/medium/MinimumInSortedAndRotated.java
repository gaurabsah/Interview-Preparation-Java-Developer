package com.dsa.arrays.medium;

public class MinimumInSortedAndRotated {

    static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[start] <= arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        int result = minimum(arr);
        System.out.println(result);

    }
}
