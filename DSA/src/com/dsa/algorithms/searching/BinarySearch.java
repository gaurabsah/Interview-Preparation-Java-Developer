package com.dsa.algorithms.searching;

/*
TC -> O(log n)
SC -> O(1)
Array should be sorted for binary search
 */
public class BinarySearch {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {             // arr[mid] > target
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 34, 67, 77, 88};
        int target = 0;

        int ans = search(arr, target);
        System.out.println(target + " is at " + ans + " index");
    }
}
